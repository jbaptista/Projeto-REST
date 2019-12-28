package br.com.juanbaptista.mybooks.dao;


import java.util.ArrayList;
import java.util.List;

import br.com.juanbaptista.mybooks.model.Livro;
import br.com.juanbaptista.mybooks.model.StatusLivro;

public class LivroDAO {
	
	public static List<Livro> listaFake() {
		List<Livro> livrosFake = new ArrayList<Livro>();
		
		livrosFake.add(new Livro(1L, "Espaço pra Deus", "Henri Nouwen", "Impacto Publicações", 96, StatusLivro.DISPONIVEL));
		livrosFake.add(new Livro(2L, "Cristianismo Puro e Simples", "C. S. Lewis", "Thomas Nelson", 288, StatusLivro.DISPONIVEL));
		livrosFake.add(new Livro(3L, "A Presença", "Bill Johnson", "Edilan", 200, StatusLivro.DISPONIVEL));
		
		return livrosFake;
	}
	
}
