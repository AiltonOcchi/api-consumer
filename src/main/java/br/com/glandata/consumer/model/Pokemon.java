package br.com.glandata.consumer.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@ToString
public class Pokemon {
	
	@Getter @Setter
	private String name;
	
	@Getter @Setter
	private PokemonSprites sprites;

}
