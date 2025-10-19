package fr.utln.logic.firstorder.connecteurs;

import fr.utln.logic.firstorder.Formule;
import fr.utln.logic.firstorder.Interpretation;
import lombok.AllArgsConstructor;
import lombok.Getter;


@AllArgsConstructor(access = lombok.AccessLevel.PRIVATE)
@Getter
public class Not implements Formule{
	Formule post;
	
	public static Formule not(Formule post){
		return new Not(post);
	}

	@Override
	public String toString(){
		return "!" + post;
	}

	@Override
	public boolean eval(Interpretation interpretation){
		throw new UnsupportedOperationException("Unimplemented method 'eval'");
	}
}