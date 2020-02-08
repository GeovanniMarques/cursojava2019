package model;

import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.table.DatabaseTable;

@DatabaseTable(tableName = "livro")

public class Livro {
	
	public static final String ISBN_FIELD_NAME = "isbn";
	public static final String TITULO_FIELD_NAME = "titulo";
	
	@DatabaseField(generatedId = true)
	private int id;
	
	@DatabaseField(columnName = ISBN_FIELD_NAME, canBeNull = false)
	private long isbn;
	
	@DatabaseField(columnName = TITULO_FIELD_NAME)
	private String titulo;
	
	
	//isbn não pode ser atribuido por int, somente por long (l) no final do número
	
	
	private int edicao;
	private int ano;
	private String formato;
	private int paginas;
	private String editora;
	private String autor;
	
	
	public void setIsbn(long isbn) {
		this.isbn = isbn;
	}
	
	public long getIsbn() {
		return isbn;
	}
	
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	
	public String getTitulo() {
		return titulo;
	}
	
	public void setEdicao(int edicao) {
		this.edicao = edicao;
	}
	
	public int getEdicao(int edicao) {
		return edicao;
	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}

	public String getFormato() {
		return formato;
	}

	public void setFormato(String formato) {
		this.formato = formato;
	}

	public int getPaginas() {
		return paginas;
	}

	public void setPaginas(int paginas) {
		this.paginas = paginas;
	}

	public String getEditora() {
		return editora;
	}

	public void setEditora(String editora) {
		this.editora = editora;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public int getEdicao() {
		return edicao;
	}

	public Livro(long isbn, String titulo, int edicao, int ano, String formato, int paginas, String editora,
			String autor) {
		super();
		this.isbn = isbn;
		this.titulo = titulo;
		this.edicao = edicao;
		this.ano = ano;
		this.formato = formato;
		this.paginas = paginas;
		this.editora = editora;
		this.autor = autor;
	}

	public Livro() {
		super();
	}

	@Override
	public String toString() {
		return "Livro [isbn=" + isbn + ", titulo=" + titulo + ", edicao=" + edicao + ", ano=" + ano + ", formato="
				+ formato + ", paginas=" + paginas + ", editora=" + editora + ", autor=" + autor + "]";
	}

			
}
