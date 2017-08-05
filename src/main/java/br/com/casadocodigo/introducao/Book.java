package br.com.casadocodigo.introducao;

import org.joda.time.DateTime;

public class Book {

	private final String name;
	private final String author;
	private final DateTime releaseDate;

	// outros atributos

	public Book (String name, String author, String releaseDate) {
		this.name = name;
		this.author = author;
		this.releaseDate = DateTime.parse(releaseDate);
	}

	// getters e outros métodos

	public DateTime getReleaseDate() {
		return releaseDate;
	}

	public boolean hasAuthor(String name) {
		return author.contains(name);
	}

	@Override
	public String toString() {
		return "\nLivro " + name
			+  "\nautor: " + author
			+  "\nlançado em: " + releaseDate;
	}
}
