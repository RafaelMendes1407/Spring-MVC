package com.rafael.Metas_de_Vida.models;

public class Meta {

	private String priority;
	private String description;
	private boolean situation;

	public Meta(String priority, String description, boolean situation) {
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

}
