package fr.utln.logic.firstorder.evaluations;


@FunctionalInterface
public interface EvaluationPredicate{
	boolean eval(String... values);
}