package fr.univtln.spelerin.connecteurs;

import fr.univtln.spelerin.Formule;
import fr.univtln.spelerin.Interpretation;
import fr.univtln.spelerin.VarSet;
import lombok.AllArgsConstructor;
import lombok.Getter;


@AllArgsConstructor(access = lombok.AccessLevel.PRIVATE)
@Getter
public class Impl implements Formule{
	Formule pre;
	Formule post;
	
	public static Formule impl(Formule pre, Formule post){
		// VarSet varset = pre.getVarset().union(post.getVarset());
		return new Impl(pre, post);
	}

	@Override
	public String toString(){
		return "(" + pre + " -> " + post + ")";
	}
}