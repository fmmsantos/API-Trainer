package com.example.trainer.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.trainer.api.dominio.Aluno;

@Repository
public interface AlunoRepository extends JpaRepository<Aluno, Long> {

}
