package com.example.restQL;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.restQL.buscaInformacoesAPI.BuscaInformacoesAPI;

@SpringBootApplication
public class RestQlApplication {

	public static void main(String[] args) {
		SpringApplication.run(RestQlApplication.class, args);
		BuscaInformacoesAPI.recuperarPessoaPorId();
	}	
	
}
