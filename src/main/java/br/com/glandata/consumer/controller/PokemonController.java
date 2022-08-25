package br.com.glandata.consumer.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import br.com.glandata.consumer.model.Pokemon;

@RestController
@RequestMapping("/pokemon")
public class PokemonController {
	
	@Autowired
	private RestTemplate restTemplate;
	
	@GetMapping("/{idPokemon}")
	public ResponseEntity<Pokemon> exibePokemon(@PathVariable Integer idPokemon){
		
		Pokemon pokemon = restTemplate.getForObject("https://pokeapi.co/api/v2/pokemon-form/"+idPokemon+"/", Pokemon.class);
		return ResponseEntity.ok(pokemon);
	}
	
}
