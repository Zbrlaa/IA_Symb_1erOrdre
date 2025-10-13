package fr.univtln.spelerin.connecteurs;

import fr.univtln.spelerin.Formule;
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
}