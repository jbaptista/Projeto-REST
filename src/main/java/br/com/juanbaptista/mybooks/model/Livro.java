package br.com.juanbaptista.mybooks.model;

public class Livro {
	
	private Long id;
	private String titulo;
	private String autor;
	private String editora;
	private int paginas;
	private StatusLivro status;
	
	
	
	public Livro(Long id, String titulo, String autor, String editora, int paginas, StatusLivro status) {
		super();
		this.id = id;
		this.titulo = titulo;
		this.autor = autor;
		this.editora = editora;
		this.paginas = paginas;
		this.status = status;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Livro other = (Livro) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
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
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public StatusLivro getStatus() {
		return status;
	}
	public void setStatus(StatusLivro status) {
		this.status = status;
	}

}
