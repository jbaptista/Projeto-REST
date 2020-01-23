package br.com.juanbaptista.mybooks.controller.form;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import br.com.juanbaptista.mybooks.model.Livro;

public class LivroForm {
	
	@NotNull @NotEmpty
	private String titulo;
	private String autor;
	private String editora;
	private int paginas;
	
	public LivroForm(String titulo, String autor, String editora, int paginas) {
		super();
		this.titulo = titulo;
		this.autor = autor;
		this.editora = editora;
		this.paginas = paginas;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getAutor() {
		return autor;
	}
	public void setAutor(String autor) {
		this.autor = autor;
	}
	public String getEditora() {
		return editora;
	}
	public void setEditora(String editora) {
		this.editora = editora;
	}
	public int getPaginas() {
		return paginas;
	}
	public void setPaginas(int paginas) {
		this.paginas = paginas;
	}
	
	public Livro converter() {
		return new Livro(titulo, autor, editora, paginas);
	}
	
}
