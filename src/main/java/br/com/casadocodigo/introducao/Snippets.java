package br.com.casadocodigo.introducao;

import java.time.LocalDateTime;
import java.util.*;

public class Snippets {

	public static void main(String[] args) {

		// voltando datas com calendar

		Calendar yesterday = Calendar.getInstance();
		yesterday.add(Calendar.DATE, -1);

		LocalDateTime.now().minusDays(1);

		// exemplo de filter do optional

		Optional<String> author = Optional.ofNullable("Rodrigo Turini, Paulo Silveira");

		boolean hasAuthor = author
				.filter(s -> s.contains("Rodrigo Turini"))
				.isPresent();

		System.out.println(hasAuthor);
	}
}
