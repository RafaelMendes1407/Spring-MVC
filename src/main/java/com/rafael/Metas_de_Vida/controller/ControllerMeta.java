package com.rafael.Metas_de_Vida.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.rafael.Metas_de_Vida.models.ListMetas;
import com.rafael.Metas_de_Vida.models.Meta;

@RestController
public class ControllerMeta {
	
	Meta meta1 = new Meta("Altissima!!", "Entrar para o time da Zup.", true);
	
	ListMetas listMetas = new ListMetas(meta1);
	
	@GetMapping
	public String getMetas() {
		return listMetas.getMetas();
	}
	
	@PostMapping
	public String postMeta(@RequestBody Meta meta) {
		listMetas.addMetas(meta);
		return "OK!";
	}
	
	
	
}
