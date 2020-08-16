package com.rafael.Metas_de_Vida.controller;

import java.util.ArrayList;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.rafael.Metas_de_Vida.models.Meta;

@RestController
@RequestMapping(path = "/")
public class ControllerMeta {
	
	Meta meta1 = new Meta("Altissima!!", "Entrar para o time da Zup.", true);
	
	ArrayList<Meta> listMetas = new ArrayList<>();
	 
	public ControllerMeta() {
		this.listMetas.add(meta1);
	}
	
	@GetMapping(path = "/getmetas")
	public @ResponseBody ArrayList<Meta> getMetas() {
		return this.listMetas;
	}
	
	@PostMapping
	@ResponseStatus(value = HttpStatus.CREATED)
	public void postMeta(@RequestBody Meta meta) {
		listMetas.add(meta);
	}
}
