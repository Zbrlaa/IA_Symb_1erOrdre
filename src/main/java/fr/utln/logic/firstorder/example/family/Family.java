package fr.utln.logic.firstorder.example.family;

import static fr.utln.logic.firstorder.connecteurs.And.and;
import static fr.utln.logic.firstorder.connecteurs.Or.or;
import static fr.utln.logic.firstorder.connecteurs.Not.not;
import static fr.utln.logic.firstorder.Predicate.pred;
import static fr.utln.logic.firstorder.quantifieurs.Exists.exists;
import static fr.utln.logic.firstorder.termes.Var.var;
import static fr.utln.logic.firstorder.termes.Function.func;

import fr.utln.logic.firstorder.Formule;
import fr.utln.logic.firstorder.Interpretation;
import fr.utln.logic.firstorder.termes.Terme;
import fr.utln.logic.firstorder.termes.Var;

import java.util.Map;

public class Family{
	public static Formule cousin(Terme x, Terme y){
		//Le but est de trouver un grand parent commun entre x et y
		//Et qu'ils ne soient pas freres/soeurs (même parent ou parents conjoints)

		//Les parents
		Var a = var("a");
		Var b = var("b");
		//Le grand parent
		Var gp = var("gp");

		//Vrai si a pere ou mere de x
		//De même pour b avec y
		Formule parentA = or(pred("pere", a, x), pred("mere", a, x));
		Formule parentB = or(pred("pere", b, y), pred("mere", b, y));

		//Vrai si grand parent commun
		Formule gpCommun = exists(gp, and(or(pred("pere", gp, a), pred("mere", gp, a)),
											or(pred("pere", gp, b), pred("mere", gp, b))));

		//Continuer
		//Faire des verifs :
			//x et y diff
			//a != b et a pas conjoints de b
			//Voir pour des gp conjoints ?
		return null;
	}

	public static void main(String[] args){
	}
}