import java.util.*;
import java.util.stream.*;

public class Collectorss {

	public static void main(String[] args) {
		
		Books.all().forEach(System.out::println);

		// filter
		Books.all().stream()
		  .filter(b -> b.getCategories().contains(Category.PROGRAMMING))
		  .collect(Collectors.groupingBy(Book::getAuthor));

		// Collectors.filtering
		Books.all().stream()
		  .collect(Collectors.groupingBy(Book::getAuthor, 
		  Collectors.filtering(
			b -> b.getCategories().contains(Category.PROGRAMMING), 
		Collectors.toList())));

		// Collectors.mapping
		Books.all().stream()
		  .collect(Collectors.groupingBy(Book::getAuthor, 
		  Collectors.mapping(Book::getCategories, 
		Collectors.toList())));

		// Collectors.mapping sem duplicacao, com toSet
		Books.all().stream()
		  .collect(Collectors.groupingBy(Book::getAuthor, 
		  Collectors.mapping(Book::getCategories, 
		Collectors.toSet())));

		// map de set de list
		Map<String,Set<List<Category>>> map = 
		  Books.all().stream()
		  .collect(Collectors.groupingBy(Book::getAuthor, 
		  Collectors.mapping(Book::getCategories, 
		Collectors.toSet())));

		//Collectors.flatMapping
		Books.all().stream()
		  .collect(Collectors.groupingBy(Book::getAuthor, 
		  Collectors.flatMapping(
			b -> b.getCategories().stream(), 
		Collectors.toSet())));

	}
}