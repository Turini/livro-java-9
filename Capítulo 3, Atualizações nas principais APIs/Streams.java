import java.util.*;
import java.util.stream.*;

public class Streams {

	public static void main(String[] args) {
		
		Map<Integer, String> weekDays = new HashMap<>();
		weekDays.put(1, "Domingo");
		weekDays.put(2, "Segunda");
		weekDays.put(3, "Terça");
		weekDays.put(4, "Quarta");
		weekDays.put(5, "Quinta");
		weekDays.put(6, "Sexta");
		weekDays.put(7, "Sábado");
		// weekDays.put(8, null); com essa linha daria NPE

		List<String> dayNames = weekDays
			.entrySet()
			.stream()
			.flatMap(e -> Stream.of(e.getValue()))
			.map(s -> s.substring(0,3))
			.collect(Collectors.toList());

		System.out.println(dayNames);
		// [Dom, Seg, Ter, Qua, Qui, Sex, Sáb]

		// agora adicionando o valor nullo
		weekDays.put(8, null);

		// e executando sem o map

		dayNames = weekDays
			.entrySet()
			.stream()
			.flatMap(e -> Stream.of(e.getValue()))
			.collect(Collectors.toList());

		System.out.println(dayNames);
		// [Domingo, Segunda, Terça, Quarta, Quinta, Sexta, Sábado, null]

		// agora com ofNullable
		dayNames = weekDays
			.entrySet()
			.stream()
			.flatMap(e -> Stream.ofNullable(e.getValue()))
			.collect(Collectors.toList());

		System.out.println(dayNames);
		// [Domingo, Segunda, Terça, Quarta, Quinta, Sexta, Sábado]

		// resolvendo com filter da forma antiga
		dayNames = weekDays
			.entrySet()
			.stream()
			.flatMap(e -> Stream.of(e.getValue()))
			.filter(s -> s != null)
			.map(s -> s.substring(0,3))
			.collect(Collectors.toList());

		// skip
		IntStream.range(0,10)
			.skip(5)
			.forEach(System.out::println);

		// limit
		IntStream.range(0,10)
			.limit(3)
			.forEach(System.out::println);

		// dropWhile
		IntStream.range(0,10)
			.dropWhile(e -> e <= 5)
			.forEach(System.out::println);

		// takeWhile
		IntStream.range(0,10)
			.takeWhile(e -> e <= 5)
			.forEach(System.out::println);

		// dropWhile com string
		Stream.of("muitas", "novidades", "no", "java")
			.dropWhile(s -> !s.equals("no"))
			.forEach(System.out::println);

		// takeWhile com string
		Stream.of("muitas", "novidades", "no", "java")
			.takeWhile(s -> !s.equals("no"))
			.forEach(System.out::println);

		// looping da forma antiga
		for (int i = 0; i <= 10; i = i + 1) {
			System.out.println(i);
		}

		// agora com iterate
		Stream
			.iterate(1, n -> n <= 10, n -> n + 1)
			.forEach(System.out::println);

		// com iterate e limit
		Stream
			.iterate(1, n -> n + 1)
			.limit(10)
			.forEach(System.out::println);
	}
}