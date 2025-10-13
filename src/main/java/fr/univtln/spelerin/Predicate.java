package fr.univtln.spelerin;

import java.util.Arrays;

import fr.univtln.spelerin.Interpretation;
import fr.univtln.spelerin.VarSet;
import fr.univtln.spelerin.termes.Terme;
import fr.univtln.spelerin.termes.Var;
import lombok.AllArgsConstructor;
import lombok.Getter;


@AllArgsConstructor(access = lombok.AccessLevel.PRIVATE)
@Getter
public class Predicate implements Formule{
	String name;
	Terme[] termes;

	public static Formule pred(String name, Terme... termes){
		// VarSet varset = pre.getVarset().union(post.getVarset());
		return new Predicate(name, termes);
	}

	@Override
	public String toString(){
		return name + "(" + Arrays.stream(termes)
                 .map(Object::toString)
                 .reduce((a, b) -> a + ", " + b)
                 .orElse("") + ")";
	}
}