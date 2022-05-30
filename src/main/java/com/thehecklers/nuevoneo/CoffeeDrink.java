package com.thehecklers.nuevoneo;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import org.springframework.data.neo4j.core.schema.GeneratedValue;
import org.springframework.data.neo4j.core.schema.Id;
import org.springframework.data.neo4j.core.schema.Node;

//@NodeEntity
@Node
@Data
@NoArgsConstructor
@RequiredArgsConstructor
//@ToString(exclude = "destinations")
public class CoffeeDrink {
    @Id
    @GeneratedValue
    private Long neoId;
    @NonNull
    private String id;
    @NonNull
    private String description;

//	@PersistenceCreator
//	public CoffeeDrink(String id, String description) {
//		this.id = id;
//		this.description = description;
//	}
    //	@JsonIgnoreProperties("drinks")
//	@Relationship(type = "OFFERS", direction = INCOMING)
//	private List<CoffeeShop> destinations = new ArrayList<>();
//	private Iterable<CoffeeShop> destinations = new ArrayList<>(); MH: Old style, now deprecated. Must use List
}
