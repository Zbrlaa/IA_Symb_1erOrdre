package fr.utln.logic.firstorder.connecteurs;

import fr.utln.logic.firstorder.Formule;
import fr.utln.logic.firstorder.Interpretation;
import lombok.AllArgsConstructor;
import lombok.Getter;


@AllArgsConstructor(access = lombok.AccessLevel.PRIVATE)
@Getter
public class And implements Formule{
	Formule pre;
	Formule post;

	public static Formule and(Formule pre, Formule post){
		return new And(pre, post);
	}

	@Override
	public String toString(){
		return "(" + pre + " & " + post + ")";
	}

	@Override
	public boolean eval(Interpretation interpretation){
		return pre.eval(interpretation) && post.eval(interpretation);
	}
}