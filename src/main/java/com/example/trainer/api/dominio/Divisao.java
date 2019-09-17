package com.example.trainer.api.dominio;

public enum Divisao {
	GLOBAL("Global"),
	AB("A/B"),
	ABC("A/B/C");
	
	private String nome;
	Divisao(String nome){
		this.nome = nome;
	}
	public String getNome() {
		return nome;
	}
	public static Divisao divisao(String id) {
		try{
			return Divisao.valueOf(id);
		}	catch (IllegalArgumentException e) {
	            throw new RuntimeException("Invalid value for my enum blah blah: " + id);
		
		}
	}

}

