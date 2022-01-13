package com.julio.consumoapifeignclient;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class ConsumoApiComFeignClientApplication {

	public static void main(String[] args) {
		SpringApplication.run(ConsumoApiComFeignClientApplication.class, args);
	}

}
