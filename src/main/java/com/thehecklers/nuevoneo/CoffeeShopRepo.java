package com.thehecklers.nuevoneo;

import org.springframework.data.neo4j.repository.Neo4jRepository;

public interface CoffeeShopRepo extends Neo4jRepository<CoffeeShop, Long> {
}
