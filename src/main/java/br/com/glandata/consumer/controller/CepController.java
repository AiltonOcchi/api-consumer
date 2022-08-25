package br.com.glandata.consumer.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.glandata.consumer.model.Endereco;
import br.com.glandata.consumer.service.EnderecoFeingService;

@RestController
@RequestMapping("/cep")
public class CepController {
	
	@Autowired
	private EnderecoFeingService enderecoService;

	@GetMapping("/{cep}")
	public ResponseEntity<Endereco> getCep(@PathVariable String cep) {
		
		if(cep.length()!=8) {
			return ResponseEntity.notFound().build();
		}

		Endereco endereco = enderecoService.buscaEndereco(cep);
		return ResponseEntity.ok().body(endereco);
	}

}
