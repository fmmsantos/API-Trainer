package com.example.trainer.api.dominio;

public enum Metodo {
	ALTER("Alternado por segmento corporal"),
	LOCALI("Localizado por articulação"),
	CIRC("Circuito"),
	AGANT("Agonista/Antagonista"),
	DIREC("Direcionado por grupamento Muscular");
	
	private String nome;
	
	Metodo(String nome){
		this.nome = nome;
	}
	public String getNome() {
		return nome;
	}
	public static Metodo metodo(String id) {
		try{
			return Metodo.valueOf(id);
		}	catch (IllegalArgumentException e) {
	            throw new RuntimeException("Invalid value for my enum blah blah: " + id);
		
		}
	}



}
