package com.thehecklers.nuevoneo;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import org.springframework.data.neo4j.core.schema.GeneratedValue;
import org.springframework.data.neo4j.core.schema.Id;
import org.springframework.data.neo4j.core.schema.Node;
import org.springframework.data.neo4j.core.schema.Relationship;

import java.util.ArrayList;
import java.util.List;

import static org.springframework.data.neo4j.core.schema.Relationship.Direction.OUTGOING;

//@NodeEntity
@Node
@Data
@NoArgsConstructor
@RequiredArgsConstructor
//@ToString(exclude = "drinks")
public class CoffeeShop {
    @Id
    @GeneratedValue
    private Long neoId;
    @NonNull
    private String id;
    @NonNull
    private String name;

    @JsonIgnoreProperties("destinations")
    @Relationship(type = "OFFERS", direction = OUTGOING)
//	private Iterable<CoffeeDrink> drinks = new ArrayList<>();
    private List<CoffeeDrink> drinks = new ArrayList<>();
}
