package com.thehecklers.nuevoneo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.neo4j.repository.config.EnableNeo4jRepositories;
import org.springframework.nativex.hint.TypeHint;

@TypeHint(types = {CoffeeDrink.class, CoffeeShop.class}, typeNames = {"com.thehecklers.nuevoneo.CoffeeDrink", "com.thehecklers.nuevoneo.CoffeeShop"})
//@TypeHint(types = {CoffeeDrink.class}, typeNames = {"com.thehecklers.nuevoneo.CoffeeDrink"})
@EnableNeo4jRepositories
@SpringBootApplication
public class NuevoNeoApplication {

	public static void main(String[] args) {
		SpringApplication.run(NuevoNeoApplication.class, args);
	}

}
