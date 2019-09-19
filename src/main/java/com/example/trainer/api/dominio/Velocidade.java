package com.example.trainer.api.dominio;

public enum Velocidade {
	LENTA ("Lenta"),
	MODERADA ("moderada"),
	INTENSA ("Intensa");
	
	private String velocidade;
	
	public String getVelocidade() {
		return velocidade;
		}
	
	
	Velocidade(String velocidade){
		this.velocidade = velocidade;
	}
	
	public static Velocidade velocidade(String id) {
		try{
			return Velocidade.valueOf(id);
		}	catch (IllegalArgumentException e) {
	            throw new RuntimeException("Invalid value for my enum blah blah: " + id);
		
		}
	}
	
	
	
	

}
