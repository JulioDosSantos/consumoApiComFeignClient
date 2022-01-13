package com.julio.consumoapifeignclient.feignclients;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.julio.consumoapifeignclient.model.Endereco;

@FeignClient(url = "https://viacep.com.br/ws/", name = "viacep")
public interface CepFeignClient {

	@GetMapping("{cep}/json")
	Endereco buscaEnderecoPorCep(@PathVariable("cep") String cep);

}
