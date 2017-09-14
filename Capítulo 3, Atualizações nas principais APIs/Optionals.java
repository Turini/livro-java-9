import java.util.*;
import java.util.stream.*;

public class Optionals {

	public static void main(String[] args) {
		
		Optional<Book> similar = Books.findSimilar(book);

		if (similar.isPresent()) {
			System.out.println(similar);
		} else {
			System.out.println("Não existem similares");
		}

		//ifPresent
		Books.findSimilar(book)
			.ifPresent(System.out::println);

		//ifPresentOrElse
		Books.findSimilar(book)
		.ifPresentOrElse(
			System.out::println,
			() -> System.out.println("Não existem similares")
		);

		List<Book> books = List.of(
			new Book(
				"Desbravando Java", 
				"Rodrigo Turini", 
				Category.PROGRAMMING
			),
			new Book(
				"Java 8 Prático", 
				"Paulo Silveira", 
				Category.PROGRAMMING
			),
			new Book(
				"SOLID", 
				"Mauricio Aniche", 
				Category.PROGRAMMING
			),
			new Book(
				"Guia da Startup", 
				"Joaquim Torres", 
				Category.BUSINESS
			)
		);

		// map
		List<Optional<Book>> similars = 
		books.stream()
			.map(Books::findSimilar)
			.collect(Collectors.toList());

		// map e filter
		List<Book> similars2 = 
		books.stream()
			.map(Books::findSimilar)
			.filter(Optional::isPresent)
			.map(Optional::get)
			.collect(Collectors.toList());

		// map e flatMap
		List<Book> similars3 = 
		books.stream()
			.map(Books::findSimilar)
			.flatMap(Optional::stream)
			.collect(Collectors.toList());

		// flatMap direto
		List<Book> similars4 = 
		books.stream()
			.flatMap(b -> Books.findSimilar(b).stream())
			.collect(Collectors.toList());

		Book book = new Book(
			"Desbravando Java", 
			"Rodrigo Turini", 
			Category.PROGRAMMING
		);

		// encadeando ORs
		Books.findSimilar(book)
			.or(() -> Books.findSimilar(book)) // 2
			.or(() -> Books.findSimilar(book)); // 3
	}
}