package fr.univtln.spelerin.quantifieurs;

import fr.univtln.spelerin.Formule;
import fr.univtln.spelerin.Interpretation;
import fr.univtln.spelerin.VarSet;
import fr.univtln.spelerin.termes.Var;
import lombok.AllArgsConstructor;
import lombok.Getter;


/*
 * Pour évaluation : genre de et
 */
@AllArgsConstructor(access = lombok.AccessLevel.PRIVATE)
@Getter
public class Forall implements Formule{
	Var var;
	Formule post;

	public static Formule forall(Var var, Formule post){
		// VarSet varset = pre.getVarset().union(post.getVarset());
		return new Forall(var, post);
	}

	@Override
	public String toString(){
		return "#" + var + post;
	}
}