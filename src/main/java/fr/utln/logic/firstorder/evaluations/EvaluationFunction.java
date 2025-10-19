package fr.utln.logic.firstorder.evaluations;


@FunctionalInterface
public interface EvaluationFunction{
	String eval(String... values);
}