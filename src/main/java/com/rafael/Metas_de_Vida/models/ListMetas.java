package com.rafael.Metas_de_Vida.models;

import java.util.ArrayList;

public class ListMetas {
	
	private ArrayList<Meta> metas = new ArrayList<>();
	
	public ListMetas(Meta meta){
		this.metas = this.addMetas(meta);
	}
	
	public ArrayList<Meta> addMetas(Meta meta) {
		this.metas.add(meta);
		return metas;
	}
	
	public String getMetas() {
		String m = "";
		for(Meta meta: metas) {
			m += meta.toString();
		}
		return m;
	}
	
}
