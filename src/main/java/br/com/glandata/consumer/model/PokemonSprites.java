package br.com.glandata.consumer.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@ToString
@Getter @Setter
public class PokemonSprites {
	
	@JsonProperty("back_default")
	private String backDefault;
	
	@JsonProperty("back_shiny")
	private String backShiny;
	
	@JsonProperty("front_default")
	private String frontDefault;
	
	@JsonProperty("front_shiny")
	private String frontShiny;

}
