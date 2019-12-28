package br.com.juanbaptista.mybooks.controller;

import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.juanbaptista.mybooks.dao.LivroDAO;

@RestController
public class LivrosController {
	
	@RequestMapping("/livros")
	public List<LivroDto> lista(){
		return LivroDto.converter(LivroDAO.listaFake());
	}
}
