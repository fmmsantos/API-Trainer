package com.example.trainer.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.trainer.api.dominio.Periodizacao;
@Repository
public interface PeriotizacaoRepository extends JpaRepository<Periodizacao,  Long> {
	

}
