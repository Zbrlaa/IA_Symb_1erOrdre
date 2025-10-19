package fr.utln.logic.firstorder.connecteurs;

import fr.utln.logic.firstorder.Formule;
import fr.utln.logic.firstorder.Interpretation;
import lombok.AllArgsConstructor;
import lombok.Getter;


@AllArgsConstructor(access = lombok.AccessLevel.PRIVATE)
@Getter
public class Or implements Formule{
	Formule pre;
	Formule post;

	public static Formule or(Formule pre, Formule post){
		return new Or(pre, post);
	}

	@Override
	public String toString(){
		return "(" + pre + " | " + post + ")";
	}

	@Override
	public boolean eval(Interpretation interpretation){
		throw new UnsupportedOperationException("Unimplemented method 'eval'");
	}
}