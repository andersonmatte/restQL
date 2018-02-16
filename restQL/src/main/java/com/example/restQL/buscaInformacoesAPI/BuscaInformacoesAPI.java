package com.example.restQL.buscaInformacoesAPI;

import com.example.restQL.formataJson.FormataJson;

import restql.core.RestQL;
import restql.core.config.ClassConfigRepository;
import restql.core.response.QueryResponse;

/**
 * @author Anderson Matte 
 * 
 * Classe que busca informações na API https://swapi.co/ e via restql.
 * 
 */
public class BuscaInformacoesAPI {
	
	public static void recuperarPessoaPorId() {
		ClassConfigRepository config = new ClassConfigRepository();
		config.put("pessoas", "https://swapi.co/api/people/:id");
		RestQL restQL = new RestQL(config);
		QueryResponse response = restQL.executeQuery("from pessoas with id = ?", 1);
		FormataJson formatar = new FormataJson();
		System.out.println("O response JSON é: " + formatar.prettyPrint(response.toString()));
	}
	
}
