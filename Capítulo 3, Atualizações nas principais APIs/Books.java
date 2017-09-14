import java.util.*;

public class Books {

  public static List<Book> all() {

	return List.of(
		new Book("Desbravando Java", "Rodrigo Turini"),
		new Book("APIs Java", "Rodrigo Turini"),
		new Book("Java 8 Prático", "Rodrigo Turini, Paulo Silveira"),
		new Book("TDD", "Mauricio Aniche"),
		new Book("Certificação Java", "Guilherme Silveira")
	);
  }

  public static Optional<Book> findSimilar(Book book) {
  	return Books.all().stream()
		.filter(b -> b.getCategories().equals(book.getCategories()))
		.filter(b -> !b.getAuthor().equals(book.getAuthor()))
		.findAny();
  }
}