package fr.univtln.spelerin.connecteurs;

import fr.univtln.spelerin.Formule;
import fr.univtln.spelerin.Interpretation;
import fr.univtln.spelerin.VarSet;
import lombok.AllArgsConstructor;
import lombok.Getter;


@AllArgsConstructor(access = lombok.AccessLevel.PRIVATE)
@Getter
public class And implements Formule{
	Formule pre;
	Formule post;

	public static Formule and(Formule pre, Formule post){
		// VarSet varset = pre.getVarset().union(post.getVarset());
		return new And(pre, post);
	}

	@Override
	public String toString(){
		return "(" + pre + " & " + post + ")";
	}
}