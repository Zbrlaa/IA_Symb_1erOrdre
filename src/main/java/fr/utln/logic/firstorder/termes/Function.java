package fr.utln.logic.firstorder.termes;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

import fr.utln.logic.firstorder.Interpretation;
import fr.utln.logic.firstorder.evaluations.EvaluationFunction;
import lombok.AllArgsConstructor;
import lombok.Getter;


@AllArgsConstructor(access = lombok.AccessLevel.PRIVATE)
@Getter
public class Function implements Terme{
	private static final Map<String, EvaluationFunction> evaluations  = new HashMap<>();

	public static void addEval(String name, EvaluationFunction eval){
		evaluations.put(name, eval);
	}

	String name;
	Terme[] termes;

	public static Terme func(String name, Terme... termes){
		return new Function(name, termes);
	}

	@Override
	public String eval(Interpretation interpretation){
		String[] values = Arrays.stream(termes)
						.map(t -> t.eval(interpretation))
						.toArray(String[]::new);

		return evaluations.get(name).eval(values);
	}

	public String toString(){
		return name + Arrays.toString(termes);
	}
}