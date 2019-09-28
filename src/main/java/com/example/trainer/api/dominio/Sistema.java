package com.example.trainer.api.dominio;

import com.fasterxml.jackson.annotation.JsonCreator;

public enum Sistema {
	SM("SERIES MULTIPLAS"),
	SERIECOMB("SERIES COMBINADAS"),
	PIRAM("PIRÂMIDES"),
	BISET ("BI-SET"),
	TRISET("TRI-SET"),
	SUPSET("SUPER-SET"),
	DRSET("DROP-SET"),
	TRIPSET("TRIP-SET"),
	STRIPSET("STRIP-SET"),
	PICOCONTR("PICO DE CONTRAÇÃO"),
	SET21("SET-21"),
	PREEXA("PRÉ-EXAUTAO"),
	EXAUSTAO("EXAUTÃO"),
	RESTPAUSE("REST PAUSE"),
	FADIGAEXC("FADIGA EXCENTRICA"),
	REPETPARC("REPETICÃO PARCIAL"),
	SEISVINT("6X20"),
	EXCOUNEG("EXCENTRICA OU NEGATIVA"),
	OCLUSVASC("OCLUSÃO VASCULAR"),
	FST7("FST-7"),
	GVT("GVT");
	public String nome;
	
	
	private Sistema(String nome){
		this.nome=nome;	
	}
	public String getNome() {
		return nome;
	}
	
	public static Sistema sistema(String id) {
		try{
			return Sistema.valueOf(id);
		}	catch (IllegalArgumentException e) {
	            throw new RuntimeException("Invalid value for my enum blah blah: " + id);
		
		}
	}
	
	

}
