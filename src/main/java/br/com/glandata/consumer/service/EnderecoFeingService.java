package br.com.glandata.consumer.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import br.com.glandata.consumer.model.Endereco;

@FeignClient(url= "https://viacep.com.br/ws/", name = "buscaCep")
public interface EnderecoFeingService {
	
	@GetMapping("{cep}/json")
    Endereco buscaEndereco(@PathVariable("cep") String cep);

}
