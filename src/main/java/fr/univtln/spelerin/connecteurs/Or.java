package fr.univtln.spelerin.connecteurs;

import fr.univtln.spelerin.Formule;
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
}