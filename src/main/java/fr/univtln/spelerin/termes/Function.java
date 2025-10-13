package fr.univtln.spelerin.termes;

import java.util.Arrays;

import lombok.AllArgsConstructor;
import lombok.Getter;


@AllArgsConstructor(access = lombok.AccessLevel.PRIVATE)
@Getter
public class Function implements Terme{
	String name;
	Terme[] termes;

	public static Function func(String name, Terme... termes){
		return new Function(name, termes);
	}

	public String toString(){
		return name + "(" + Arrays.stream(termes)
                 .map(Object::toString)
                 .reduce((a, b) -> a + ", " + b)
                 .orElse("") + ")";
	}
}