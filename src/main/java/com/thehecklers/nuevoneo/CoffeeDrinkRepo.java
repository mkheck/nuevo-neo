package com.thehecklers.nuevoneo;

import org.springframework.data.neo4j.repository.Neo4jRepository;

public interface CoffeeDrinkRepo extends Neo4jRepository<CoffeeDrink, Long> {
}
