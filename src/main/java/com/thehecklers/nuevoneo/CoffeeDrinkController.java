package com.thehecklers.nuevoneo;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/drinks")
@AllArgsConstructor
public class CoffeeDrinkController {
    private final CoffeeDrinkRepo drinkRepo;

    @GetMapping
    Iterable<CoffeeDrink> getAll() {
        return drinkRepo.findAll();
    }
}
