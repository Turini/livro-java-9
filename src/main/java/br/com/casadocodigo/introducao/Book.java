package br.com.casadocodigo.introducao;

public class Book {

	private final String name;
	private final String author;

	// outros atributos

	public Book (String name, String author) {
		this.name = name;
		this.author = author;
	}

	// getters e outros métodos

	public String getName() {
		return name;
	}

	public boolean hasAuthor(String name) {
		return author.contains(name);
	}

	@Override
	public String toString() {
		return "\nlivro: " + name
			+  "\nautor: " + author;
	}
}
