package com.rafael.Metas_de_Vida.models;

import javax.persistence.Entity;

import com.sun.istack.NotNull;



@Entity
public class MetaDTO {
	
	@NotNull
	private String priority;
	
	@NotNull
	private String description;
	
	@NotNull
	private boolean situation;
	
	public Meta transform() { 
		return new Meta(priority, description, situation);
	}
}
