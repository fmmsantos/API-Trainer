package com.example.trainer.api.dominio;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.NotBlank;

@Entity
public class Periodizacao {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long codigo;
	
	@Column(nullable = false)
	private int nivel;
	
	@Column(nullable = false)
	private int numeroExercicios;
	
	@Column(nullable = false)
	private int serie;
	
	@Column(nullable = false)
	private int repeticao;
	
	@Column(nullable = false)
	private int intervalo;
	
	@Enumerated(EnumType.STRING)
	private Velocidade velocidadeExecucao;
	
	@Column(nullable = false)
    private int frequenciaSemanal;
	
	@Column(nullable = false)
	private int numeroDeTreino;
	
	@Column(nullable = false)
	private int quantidadeDeSemana;
	
	@Column(nullable = false)
    private int seriesTotais;
	
	@Enumerated(EnumType.STRING)
	private Metodo metodo;
	
	@Enumerated(EnumType.STRING)
	private Sistema sistema;
	
	@Enumerated(EnumType.STRING)
	private Divisao divisao;
	
	@ManyToOne
	@JoinColumn(name = "codigo_aluno",nullable = false)
	private Aluno aluno;
	
	
	public Long getCodigo() {
		return codigo;
	}
	public void setCodigo(Long codigo) {
		this.codigo = codigo;
	}
	public Aluno getAluno() {
		return aluno;
	}
	public void setAluno(Aluno aluno) {
		this.aluno = aluno;
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
	
	
	public Velocidade getVelocidadeExecucao() {
		return velocidadeExecucao;
	}
	public void setVelocidadeExecucao(Velocidade velocidadeExecucao) {
		this.velocidadeExecucao = velocidadeExecucao;
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
		result = prime * result + ((codigo == null) ? 0 : codigo.hashCode());
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
		if (codigo == null) {
			if (other.codigo != null)
				return false;
		} else if (!codigo.equals(other.codigo))
			return false;
		return true;
	}
	
	
	
	
	
	

}
