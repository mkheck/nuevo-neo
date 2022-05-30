package com.thehecklers.nuevoneo;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.List;
import java.util.UUID;

@Component
public class DataLoader {
    private final CoffeeDrinkRepo cdRepo;
    private final CoffeeShopRepo csRepo;

    public DataLoader(CoffeeDrinkRepo cdRepo, CoffeeShopRepo csRepo) {
//    public DataLoader(CoffeeDrinkRepo cdRepo) {
        this.cdRepo = cdRepo;
        this.csRepo = csRepo;
    }

    @PostConstruct
    private void load() {
        // Coffee drinks
        cdRepo.deleteAll();

        CoffeeDrink americano = cdRepo.save(new CoffeeDrink(UUID.randomUUID().toString(), "Americano"));
        CoffeeDrink espresso = cdRepo.save(new CoffeeDrink(UUID.randomUUID().toString(), "Espresso"));
        CoffeeDrink flatWhite = cdRepo.save(new CoffeeDrink(UUID.randomUUID().toString(), "Flat white"));
        CoffeeDrink latte = cdRepo.save(new CoffeeDrink(UUID.randomUUID().toString(), "Latte"));

        // Coffee shops
        csRepo.deleteAll();

        CoffeeShop maevas = csRepo.save(new CoffeeShop(UUID.randomUUID().toString(), "Maeva's Coffee"));
        CoffeeShop germania = csRepo.save(new CoffeeShop(UUID.randomUUID().toString(), "Germania Brew Haus"));
        CoffeeShop stlbreadco = csRepo.save(new CoffeeShop(UUID.randomUUID().toString(), "St. Louis Bread Company"));

        // Associate!
        maevas.setDrinks(List.of(americano, espresso, flatWhite, latte));
        csRepo.save(maevas);

        germania.setDrinks(List.of(americano, espresso, flatWhite, latte));
        csRepo.save(germania);

        stlbreadco.setDrinks(List.of(americano, espresso, latte));
        csRepo.save(stlbreadco);

        System.out.println("--- Drinks ---");
        cdRepo.findAll().forEach(System.out::println);

        System.out.println("--- Shops ---");
        csRepo.findAll().forEach(System.out::println);

/*
        log.info("--- Drinks ---");
        cdRepo.findAll().forEach(drink -> log.info(drink.toString()));
        log.info("");
        log.info("--- Shops ---");
        csRepo.findAll().forEach(shop -> log.info(shop.toString()));
*/
    }
}
