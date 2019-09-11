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

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return sexo;
	}

}
