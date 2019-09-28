package com.example.trainer.api.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.stereotype.Service;

import com.example.trainer.api.dominio.Aluno;
import com.example.trainer.api.repository.AlunoRepository;

@Service
public class AlunoService {
	
	@Autowired
	private AlunoRepository alunoRepo;
	
	
	public void atualizarPropriedadeAtivo(Long codigo, Boolean ativo) {
		
		}
	
	public Aluno buscarAlunoCodigo(Long codigo) {
		Aluno alunoSalvo = alunoRepo.findByCodigo(codigo);
		if(alunoSalvo == null) {
			throw new EmptyResultDataAccessException(1);
		}
		return alunoSalvo;
		
	}

}
