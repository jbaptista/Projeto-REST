package br.com.juanbaptista.mybooks.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import br.com.juanbaptista.mybooks.dao.LivroDAO;
import br.com.juanbaptista.mybooks.model.Livro;

@Controller
public class LivrosController {
	
	@RequestMapping("/livros")
	@ResponseBody
	public List<Livro> lista(){
		return LivroDAO.listaFake();
	}
}
