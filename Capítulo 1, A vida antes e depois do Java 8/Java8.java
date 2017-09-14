import java.util.*;

import static java.util.Comparator.comparing;

public class Java8 {

	public static void main(String[] args) {

		List<Book> allBooks = new ArrayList<>();

		allBooks.add(new Book("Desbravando Java", "Rodrigo Turini"));
		allBooks.add(new Book("APIs Java", "Rodrigo Turini"));
		allBooks.add(new Book("Java 8 Prático", "Rodrigo Turini, Paulo Silveira"));
		allBooks.add(new Book("TDD", "Mauricio Aniche"));
		allBooks.add(new Book("Certificação Java", "Guilherme Silveira"));

		allBooks.stream()
			.filter(book -> book.hasAuthor("Rodrigo Turini"))
			.sorted(comparing(Book::getName))
			.forEach(System.out::println);
	}
}
