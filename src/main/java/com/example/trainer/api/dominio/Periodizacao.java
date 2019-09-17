package com.example.trainer.api.dominio;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Periodizacao {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private int nivel;
	private int numeroExercicios;
	private int serie;
	private int repeticao;
	private int intervalo;
	private String velocidadeExecução;
	private int frequenciaSemanal;
	private int numeroDeTreino;
	private int quantidadeDeSemana;
	private int seriesTotais;
	@Enumerated(EnumType.STRING)
	private Metodo metodo;
	@Enumerated(EnumType.STRING)
	private Sistema sistema;
	@Enumerated(EnumType.STRING)
	private Divisao divisao;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public int getNivel() {
		return nivel;
	}
	public void setNivel(int nivel) {
		this.nivel = nivel;
	}
	public int getNumeroExercicios() {
		return numeroExercicios;
	}
	public void setNumeroExercicios(int numeroExercicios) {
		this.numeroExercicios = numeroExercicios;
	}
	public int getSerie() {
		return serie;
	}
	public void setSerie(int serie) {
		this.serie = serie;
	}
	public int getRepeticao() {
		return repeticao;
	}
	public void setRepeticao(int repeticao) {
		this.repeticao = repeticao;
	}
	public int getIntervalo() {
		return intervalo;
	}
	public void setIntervalo(int intervalo) {
		this.intervalo = intervalo;
	}
	public String getVelocidadeExecução() {
		return velocidadeExecução;
	}
	public void setVelocidadeExecução(String velocidadeExecução) {
		this.velocidadeExecução = velocidadeExecução;
	}
	public int getFrequenciaSemanal() {
		return frequenciaSemanal;
	}
	public void setFrequenciaSemanal(int frequenciaSemanal) {
		this.frequenciaSemanal = frequenciaSemanal;
	}
	public int getNumeroDeTreino() {
		return numeroDeTreino;
	}
	public void setNumeroDeTreino(int numeroDeTreino) {
		this.numeroDeTreino = numeroDeTreino;
	}
	public int getQuantidadeDeSemana() {
		return quantidadeDeSemana;
	}
	public void setQuantidadeDeSemana(int quantidadeDeSemana) {
		this.quantidadeDeSemana = quantidadeDeSemana;
	}
	public int getSeriesTotais() {
		return seriesTotais;
	}
	public void setSeriesTotais(int seriesTotais) {
		this.seriesTotais = seriesTotais;
	}
	public Metodo getMetodo() {
		return metodo;
	}
	public void setMetodo(Metodo metodo) {
		this.metodo = metodo;
	}
	public Sistema getSistema() {
		return sistema;
	}
	public void setSistema(Sistema sistema) {
		this.sistema = sistema;
	}
	public Divisao getDivisao() {
		return divisao;
	}
	public void setDivisao(Divisao divisao) {
		this.divisao = divisao;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Periodizacao other = (Periodizacao) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}
	
	
	
	
	

}
