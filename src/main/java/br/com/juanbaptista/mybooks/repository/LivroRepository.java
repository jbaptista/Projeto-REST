package br.com.juanbaptista.mybooks.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.juanbaptista.mybooks.model.Livro;

public interface LivroRepository extends JpaRepository<Livro, Long>{

	List<Livro> findByTitulo(String titulo);
	
	List<Livro> findByAutor(String autor);

}
