package br.com.casadocodigo.introducao;

import java.util.*;

public class Java7 {

	public static void main(String[] args) {

		List<Book> allBooks = new ArrayList<>();

		allBooks.add(new Book("Desbravando Java", "Rodrigo Turini", null));
		allBooks.add(new Book("APIs Java", "Rodrigo Turini", "2016-01-01"));
		allBooks.add(new Book("Java 8 Prático", "Rodrigo Turini, Paulo Silveira", "2014-04-18"));
		allBooks.add(new Book("TDD", "Mauricio Aniche", "2013-01-01"));
		allBooks.add(new Book("Certificação Java", "Guilherme Silveira", "2016-01-01"));

		List<Book> filteredBooks = new ArrayList<>();

		for (Book book: allBooks) {
			if (book.hasAuthor("Rodrigo Turini")) {
				filteredBooks.add(book);
			}
		}

		Collections.sort(filteredBooks, new Comparator<Book>() {
			public int compare(Book b1, Book b2) {
				return b1.getReleaseDate().compareTo(b2.getReleaseDate());
			}
		});

		for (Book book: filteredBooks) {
			System.out.println(book);
		}
	}
}
