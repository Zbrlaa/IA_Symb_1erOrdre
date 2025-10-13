package fr.univtln.spelerin;

import static fr.univtln.spelerin.connecteurs.Not.not;
import static fr.univtln.spelerin.connecteurs.And.and;
import static fr.univtln.spelerin.connecteurs.Or.or;
import static fr.univtln.spelerin.connecteurs.Impl.impl;
import static fr.univtln.spelerin.connecteurs.Equi.equi;
import static fr.univtln.spelerin.termes.Function.func;
import static fr.univtln.spelerin.quantifieurs.Forall.forall;
import static fr.univtln.spelerin.quantifieurs.Exists.exists;
import static fr.univtln.spelerin.termes.Var.var;
import static fr.univtln.spelerin.Predicate.pred;


public class App {
	public static void main(String[] args) {
		Formule f = forall(var("x"),
						equi(and(or(not(pred("P",	var("x"))),
									pred("Q", func("f", var("x")), var("y"))),
								impl(pred("R",var("x")),
									pred("Q",var("y"), var("x")))),
							or(pred("R", var("z")),
								pred("Q", var("y"), var("z")))));

		System.out.println("f : " + f);
	}
}