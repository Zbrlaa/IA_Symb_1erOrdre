package fr.univtln.spelerin.termes;

import lombok.AllArgsConstructor;
import lombok.Getter;


@AllArgsConstructor(access = lombok.AccessLevel.PRIVATE)
@Getter
public class Var implements Terme{
	String name;

	public static Var var(String name){
		return new Var(name);
	}

	public String toString() {
		return name;
	}
}