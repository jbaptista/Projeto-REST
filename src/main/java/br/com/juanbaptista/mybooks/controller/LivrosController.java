package br.com.juanbaptista.mybooks.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.juanbaptista.mybooks.controller.dto.LivroDto;
import br.com.juanbaptista.mybooks.model.Livro;
import br.com.juanbaptista.mybooks.repository.LivroRepository;

@RestController
public class LivrosController {
	
	@Autowired
	private LivroRepository livroRepository;
	
	@RequestMapping("/livros")
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
}
