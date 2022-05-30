package com.thehecklers.nuevoneo;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/shops")
@AllArgsConstructor
public class CoffeeShopController {
    private final CoffeeShopRepo shopRepo;

    @GetMapping
    Iterable<CoffeeShop> getAll() {
        return shopRepo.findAll();
    }
}
