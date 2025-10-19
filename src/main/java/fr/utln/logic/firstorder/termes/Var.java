package fr.utln.logic.firstorder.termes;

import fr.utln.logic.firstorder.Interpretation;
import lombok.AllArgsConstructor;
import lombok.Getter;


@AllArgsConstructor(access = lombok.AccessLevel.PRIVATE)
@Getter
public class Var implements Terme{
	String name;

	public static Var var(String name){
		return new Var(name);
	}

	public String eval(Interpretation interpretation){
		return interpretation.getValues().get(name);
	}

	public String toString() {
		return name;
	}
}