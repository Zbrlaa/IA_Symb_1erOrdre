package fr.utln.logic.firstorder.quantifieurs;

import fr.utln.logic.firstorder.Formule;
import fr.utln.logic.firstorder.Interpretation;
import fr.utln.logic.firstorder.termes.Var;
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
		return new Exists(var, post);
	}

	@Override
	public String toString(){
		return "$" + var + post;
	}

	@Override
	public boolean eval(Interpretation interpretation){
		throw new UnsupportedOperationException("Unimplemented method 'eval'");
	}
}