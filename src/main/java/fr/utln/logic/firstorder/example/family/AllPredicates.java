package fr.utln.logic.firstorder.example.family;

import java.util.Map;

import fr.utln.logic.firstorder.Predicate;
import lombok.AllArgsConstructor;


@AllArgsConstructor(access = lombok.AccessLevel.PRIVATE)
public class AllPredicates{
	public static final Map<String, String> PERES = Map.ofEntries(
		Map.entry("Jin", "Mathieu"),
		Map.entry("Amara", "Mathieu"),
		Map.entry("Noah", "Amir"),
		Map.entry("Jack", "Jin"),
		Map.entry("Kilian", "Noah")
	);

	public static final Map<String, String> MERES = Map.ofEntries(
		Map.entry("Jin", "Chen"),
		Map.entry("Amara", "Chen"),
		Map.entry("Noah", "Laura"),
		Map.entry("Jack", "Nia"),
		Map.entry("Kilian", "Amara")
	);

	public static void create(){
		Predicate.addEval("pere", values -> {
			String x = values[0];
			String y = values[1];

			return x.equals(PERES.get(y));
		});

		Predicate.addEval("mere", values -> {
			String x = values[0];
			String y = values[1];

			return x.equals(MERES.get(y));
		});
	}
}