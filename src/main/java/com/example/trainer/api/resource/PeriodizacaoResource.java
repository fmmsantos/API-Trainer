package com.example.trainer.api.resource;

import java.util.List;
import java.util.Optional;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.example.trainer.api.dominio.Periodizacao;
import com.example.trainer.api.exception.NotFoundException;
import com.example.trainer.api.repository.PeriotizacaoRepository;

@RestController
@RequestMapping("/periodizacao")
public class PeriodizacaoResource {
	
	@Autowired
	public PeriotizacaoRepository periotizacaoRepo;
	
	@GetMapping
	public List<Periodizacao> buscarTodos() {
		List<Periodizacao> periodos = periotizacaoRepo.findAll();
		return periodos;
		}
	
	
	@GetMapping("/{id}")
	public ResponseEntity<Periodizacao> buscarId(@PathVariable Long id) {
		 if (id == null) {
	        	throw new NotFoundException("Periodizacao nao encontrada com o codigo: " + id); 
	        }
	return periotizacaoRepo.findById(id).map(record -> ResponseEntity.ok().body(record))
	           .orElse(ResponseEntity.notFound().build());
	
	}
	
	@PostMapping
	@ResponseStatus(code = HttpStatus.CREATED)
	public void salvar(@RequestBody @Valid Periodizacao periodo ) {
		periotizacaoRepo.save(periodo);
		
	}

}
