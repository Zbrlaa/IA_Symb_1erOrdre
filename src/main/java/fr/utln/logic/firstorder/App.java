package fr.utln.logic.firstorder;

import static fr.utln.logic.firstorder.connecteurs.And.and;
import static fr.utln.logic.firstorder.connecteurs.Equi.equi;
import static fr.utln.logic.firstorder.connecteurs.Impl.impl;
import static fr.utln.logic.firstorder.connecteurs.Not.not;
import static fr.utln.logic.firstorder.connecteurs.Or.or;
import static fr.utln.logic.firstorder.Predicate.pred;
import static fr.utln.logic.firstorder.quantifieurs.Exists.exists;
import static fr.utln.logic.firstorder.quantifieurs.Forall.forall;
import static fr.utln.logic.firstorder.termes.Function.func;
import static fr.utln.logic.firstorder.termes.Var.var;

import java.util.Map;

import fr.utln.logic.firstorder.example.family.AllFunctions;
import fr.utln.logic.firstorder.example.family.AllPredicates;
import fr.utln.logic.firstorder.termes.Terme;


public class App {
	public static void main(String[] args){
		AllPredicates.create();
		AllFunctions.create();

		Formule f = forall(var("x"),
						equi(and(or(not(pred("P",	var("x"))),
									pred("Q", func("f", var("x")), var("y"))),
								impl(pred("R",var("x")),
									pred("Q",var("y"), var("x")))),
							or(pred("R", var("z")),
								pred("Q", var("y"), var("z")))));

		System.out.println("f : " + f);

		Interpretation i = new Interpretation(Map.ofEntries(Map.entry("x", "Laura"),
															Map.entry("y", "Noah")));

		Terme fun = func("conjoint", var("x"));
		System.out.println(fun + " pour " + i + " : " + fun.eval(i));

		Formule p = pred("mere", var("x"), var("y"));
		System.out.println(p + " pour " + i + " : " + p.eval(i));
	}
}