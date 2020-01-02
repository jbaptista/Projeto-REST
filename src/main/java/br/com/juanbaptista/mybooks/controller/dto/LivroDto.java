package br.com.juanbaptista.mybooks.controller.dto;

import java.util.List;
import java.util.stream.Collectors;

import br.com.juanbaptista.mybooks.model.Livro;

public class LivroDto {
	
	private Long id;
	private String titulo;
	private String status;
	
	public LivroDto(Livro livro) {
		this.id = livro.getId();
		this.titulo = livro.getTitulo();
		this.status = livro.getStatus().name();
	}

	public Long getId() {
		return id;
	}

	public String getTitulo() {
		return titulo;
	}

	public String getStatus() {
		return status;
	}
	
	public static List<LivroDto> converter(List<Livro> livros){
		return livros.stream().map(LivroDto::new).collect(Collectors.toList());
	}

}
