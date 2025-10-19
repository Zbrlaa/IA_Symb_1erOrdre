package fr.utln.logic.firstorder.quantifieurs;

import fr.utln.logic.firstorder.Formule;
import fr.utln.logic.firstorder.Interpretation;
import fr.utln.logic.firstorder.termes.Var;
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
		return new Forall(var, post);
	}

	@Override
	public String toString(){
		return "#" + var + post;
	}

	@Override
	public boolean eval(Interpretation interpretation){
		throw new UnsupportedOperationException("Unimplemented method 'eval'");
	}
}