package br.com.casadocodigo.introducao;

import java.util.*;

import static java.util.Comparator.comparing;

public class Java8 {

	public static void main(String[] args) {

		List<Book> allBooks = new ArrayList<>();

		allBooks.add(new Book("Desbravando Java", "Rodrigo Turini", "2015-05-10"));
		allBooks.add(new Book("APIs Java", "Rodrigo Turini", "2016-01-01"));
		allBooks.add(new Book("Java 8 Prático", "Rodrigo Turini, Paulo Silveira", "2014-04-18"));
		allBooks.add(new Book("TDD", "Mauricio Aniche", "2013-01-01"));
		allBooks.add(new Book("Certificação Java", "Guilherme Silveira", "2016-01-01"));

		allBooks.stream()
			.filter(book -> book.hasAuthor("Rodrigo Turini"))
			.sorted(comparing(Book::getReleaseDate))
			.forEach(System.out::println);
	}
}
