package fr.utln.logic.firstorder.example.family;

import java.util.Map;

import fr.utln.logic.firstorder.termes.Function;
import lombok.AllArgsConstructor;


@AllArgsConstructor(access = lombok.AccessLevel.PRIVATE)
public class AllFunctions{
	private static final Map<String, String> CONJOINTS = Map.ofEntries(
		Map.entry("Amara", "Noah"),
		Map.entry("Noah", "Amara"),
		Map.entry("Amir", "Laura"),
		Map.entry("Laura", "Amir"),
		Map.entry("Chen", "Mathieu"),
		Map.entry("Mathieu", "Chen"),
		Map.entry("Emilie", "Jack"),
		Map.entry("Jack", "Emilie"),
		Map.entry("Jin", "Nia"),
		Map.entry("Nia", "Jin"),
		Map.entry("Kilian", "Louiza"),
		Map.entry("Louiza", "Kilian")
	);
	
	public static void create(){
		Function.addEval("conjoint", values -> {
			String x = values[0];

			return  CONJOINTS.get(x);
		});
	}
}