package com.example.trainer.api.resource;

import java.net.URI;
import java.util.List;
import java.util.Optional;

import javax.servlet.http.HttpServletResponse;
import javax.validation.Valid;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.example.trainer.api.dominio.Aluno;
import com.example.trainer.api.dominio.Sexo;
import com.example.trainer.api.exception.NotFoundException;
import com.example.trainer.api.repository.AlunoRepository;

@RestController
@RequestMapping("/alunos")
public class AlunoResource {
	
	@Autowired
	private AlunoRepository alunoRepositori;
	
	@GetMapping
	public List<Aluno> buscarTodos(){
		List<Aluno> alunos = alunoRepositori.findAll();
		return alunos;
	}
	@PostMapping
	@ResponseStatus(code = HttpStatus.CREATED)
	public void salvar( @Valid @RequestBody Aluno aluno,HttpServletResponse response) {
	
	
	Aluno alunoSalvo = alunoRepositori.save(aluno);

	URI uri = ServletUriComponentsBuilder.fromCurrentRequestUri().path("/{codigo}")
			.buildAndExpand(alunoSalvo.getCodigo()).toUri();
	response.setHeader("Location", uri.toASCIIString());
	
	
	}
	
	@GetMapping("/{codigo}")
	public ResponseEntity buscarCodigo(@PathVariable Long codigo) {
	return this.alunoRepositori.findById(codigo).map(aluno -> ResponseEntity.ok(aluno))
			.orElse(ResponseEntity.notFound().build());
	/*
	 *  Optional aluno = this.categoriaRepository.findById(codigo);
    return aluno.isPresent() ? 
            ResponseEntity.ok(aluno.get()) : ResponseEntity.notFound().build();
}*/
	
	}
	@DeleteMapping("/{codigo}")
	// para responder que o code é 204
	@ResponseStatus( HttpStatus.NO_CONTENT)
	public void deletarAluno(@PathVariable Long codigo) {
		this.alunoRepositori.deleteById(codigo);
		
	}
	@PutMapping("/{codigo}")
	public ResponseEntity<Aluno> atualizar(@PathVariable Long codigo,@Valid @RequestBody Aluno aluno) {
		
        Aluno p = alunoRepositori.findByCodigo(codigo);
        if (p == null) {
        	throw new NotFoundException("Aluno nao encontrado com o codigo: " + codigo); 
        }
          aluno.setCodigo(codigo);
        
        alunoRepositori.save(aluno);
      
        return ResponseEntity.ok(aluno);
	}

}
	
	
	


