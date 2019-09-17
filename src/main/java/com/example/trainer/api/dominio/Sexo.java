package com.example.trainer.api.dominio;

public enum Sexo {
	FEMININO ("F"),
	
	MASCULINO("M")
	
	 ;
	
	private String sexo ;
	
	
	
	
	
	 Sexo(String sexo) {
		 this.sexo = sexo;
		
	}
	 
	
	 

	

	public String getSexo() {
		
		return sexo;
	}

	public static Sexo sexo(String id) {
		try{
			return Sexo.valueOf(id);
		}	catch (IllegalArgumentException e) {
	            throw new RuntimeException("Invalid value for my enum blah blah: " + id);
		
		}
	}

}
