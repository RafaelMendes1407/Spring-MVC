package com.rafael.Metas_de_Vida.models;

public class Meta {
	
	private String priority;
	private String description;
	private boolean situation;
	
	
	public Meta(String priority, String description, boolean situation){
		this.priority = priority;
		this.description = description;
		this.situation = situation;
	}

	public String getPriority() {
		return priority;
	}

	public void setPriority(String priority) {
		this.priority = priority;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public boolean isSituation() {
		return situation;
	}

	public void setSituation(boolean situation) {
		this.situation = situation;
	}
	
	public String toString() {
		// função que implementa de forma Hard code a conversão do objeto para um JSON
		// Existe uma função própria para isso.
		
		
		return "{\n" + 
				"\"priority\": " + this.priority +",\n" + 
				"\"description\": " + this.description +",\n" + 
				"\"validation\": " + this.situation +  "\n " + 
				"}\n";
	}
	
}
