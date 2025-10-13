package fr.univtln.spelerin.quantifieurs;

import fr.univtln.spelerin.Formule;
import fr.univtln.spelerin.Interpretation;
import fr.univtln.spelerin.VarSet;
import fr.univtln.spelerin.termes.Var;
import lombok.AllArgsConstructor;
import lombok.Getter;

/*
 * Pour évaluation : genre de où
 */
@AllArgsConstructor(access = lombok.AccessLevel.PRIVATE)
@Getter
public class Exists implements Formule{
	Var var;
	Formule post;

	public static Formule exists(Var var, Formule post){
		// VarSet varset = pre.getVarset().union(post.getVarset());
		return new Exists(var, post);
	}

	@Override
	public String toString(){
		return "$" + var + post;
	}
}