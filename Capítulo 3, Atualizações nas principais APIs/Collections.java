import java.util.*;

public class Collections {

	public static void main(String[] args) {
		
		// da forma antiga
		Map<Integer, String> weekDays = new HashMap<>();
		weekDays.put(1, "Domingo");
		weekDays.put(2, "Segunda");
		weekDays.put(3, "Terça");
		weekDays.put(4, "Quarta");
		weekDays.put(5, "Quinta");
		weekDays.put(6, "Sexta");
		weekDays.put(7, "Sábado");
		weekDays = java.util.Collections.unmodifiableMap(weekDays);

		// da forma nova, com Map#of
		Map<Integer, String> weekDays2 = Map.of(
			1, "Domingo", 
			2, "Segunda", 
			3, "Terça", 
			4, "Quarta", 
			5, "Quinta", 
			6, "Sexta", 
			7, "Sábado" 
		);

		// da forma nova, com Map#ofEntries
		Map.ofEntries( 
			Map.entry(1, "Domingo"), 
			Map.entry(2, "Segunda"), 
			Map.entry(3, "Terça") 
		);

		// listas da forma nova 
		List<String> names = List.of("Rodrigo", "Vivian", "Alexandre");

		// sets da forma nova 
		Set<String> colors = Set.of("azul", "vermelho", "amarelo");

		// vai dar erro
		try {
			names.add("Paulo");
		} catch(Exception e) {
			// a lista é imutável
		}

		// ArrayList.of("a", "b", "c"); não compila

		// vai dar erro 
		try {
			List.of("não", "pode", "ter", null);	
		} catch(Exception e) {
			// não pode ter nulls
		}
		
		// vai dar erro 
		try {
			Map.of(1, "a", 1, "b");
		} catch(Exception e) {
			// nao pode ter chaves duplicadas
		}
	}
}