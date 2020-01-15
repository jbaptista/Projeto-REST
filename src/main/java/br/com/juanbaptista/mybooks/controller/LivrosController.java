package br.com.juanbaptista.mybooks.controller;

import java.net.URI;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.util.UriComponentsBuilder;

import br.com.juanbaptista.mybooks.controller.dto.LivroDto;
import br.com.juanbaptista.mybooks.controller.form.LivroForm;
import br.com.juanbaptista.mybooks.model.Livro;
import br.com.juanbaptista.mybooks.repository.LivroRepository;

@RestController
@RequestMapping("/livros")
public class LivrosController {
	
	@Autowired
	private LivroRepository livroRepository;
	
	@GetMapping
	public List<LivroDto> lista(String titulo, String autor){
		List<Livro> livros;
		
		if(titulo != null){
			livros = livroRepository.findByTitulo(titulo);
		}
		else if(autor != null) {
			livros = livroRepository.findByAutor(autor);
		}
		else {
			livros = livroRepository.findAll();
		}
		
		return LivroDto.converter(livros);
	}
	
	@PostMapping
	public ResponseEntity<LivroDto> cadastrar(@RequestBody LivroForm livroForm, UriComponentsBuilder uriBuilder) {
		Livro livro = livroForm.converter();
		livroRepository.save(livro);
		
		URI uri = uriBuilder.path("/livros/{id}").buildAndExpand(livro.getId()).toUri();
		return ResponseEntity.created(uri).body(new LivroDto(livro));
	}
}
