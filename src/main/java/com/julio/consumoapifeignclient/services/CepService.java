package com.julio.consumoapifeignclient.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.julio.consumoapifeignclient.feignclients.CepFeignClient;
import com.julio.consumoapifeignclient.model.Endereco;

@Service
public class CepService {

	@Autowired
	private CepFeignClient cepFeignClient;

	public Endereco buscaEnderecoPorCep(String cep) {
		return cepFeignClient.buscaEnderecoPorCep(cep);
	}

}
