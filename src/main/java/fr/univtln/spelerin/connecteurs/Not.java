package fr.univtln.spelerin.connecteurs;

import fr.univtln.spelerin.Formule;
import fr.univtln.spelerin.Interpretation;
import fr.univtln.spelerin.VarSet;
import lombok.AllArgsConstructor;
import lombok.Getter;


@AllArgsConstructor(access = lombok.AccessLevel.PRIVATE)
@Getter
public class Not implements Formule{
	Formule post;
	
	public static Formule not(Formule post){
		// VarSet varset = post.getVarset();
		return new Not(post);
	}

	@Override
	public String toString(){
		return "!" + post;
	}
}