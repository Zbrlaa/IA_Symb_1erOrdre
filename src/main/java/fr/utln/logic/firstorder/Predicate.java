package fr.utln.logic.firstorder;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

import fr.utln.logic.firstorder.evaluations.EvaluationPredicate;
import fr.utln.logic.firstorder.termes.Terme;
import lombok.AllArgsConstructor;
import lombok.Getter;


@AllArgsConstructor(access = lombok.AccessLevel.PRIVATE)
@Getter
public class Predicate implements Formule{
	private static final Map<String, EvaluationPredicate> evaluations  = new HashMap<>();

	public static void addEval(String name, EvaluationPredicate eval){
		evaluations.put(name, eval);
	}

	String name;
	Terme[] termes;

	public static Formule pred(String name, Terme... termes){
		return new Predicate(name, termes);
	}

	@Override
	public boolean eval(Interpretation interpretation){
		String[] values = Arrays.stream(termes)
						.map(t -> t.eval(interpretation))
						.toArray(String[]::new);

		return evaluations.get(name).eval(values);
	}

	@Override
	public String toString(){
		return name + Arrays.toString(termes);
	}
}