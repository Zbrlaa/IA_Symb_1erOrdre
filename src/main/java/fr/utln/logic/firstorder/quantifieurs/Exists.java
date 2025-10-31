package fr.utln.logic.firstorder.quantifieurs;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import fr.utln.logic.firstorder.Formule;
import fr.utln.logic.firstorder.Interpretation;
import fr.utln.logic.firstorder.example.family.AllPredicates;
import fr.utln.logic.firstorder.termes.Var;
import lombok.AllArgsConstructor;
import lombok.Getter;

/*
 * Pour évaluation : genre de où
 */
@AllArgsConstructor(access = lombok.AccessLevel.PRIVATE)
@Getter
public class Exists implements Formule{
	Var var;
	Formule post;

	public static Formule exists(Var var, Formule post){
		return new Exists(var, post);
	}

	@Override
	public String toString(){
		return "$" + var + post;
	}

	@Override
	public boolean eval(Interpretation interpretation){
		//On pourrait faire une classe pour les domaines d'interprétation si on en avait plusieurs
		//Mais pour le moment tout nos elements sont déjà dans les 2 prédicats
		Set<String> domaine = new HashSet<>();
		domaine.addAll(AllPredicates.PERES.keySet());
		domaine.addAll(AllPredicates.MERES.keySet());
		
		for (String value : domaine) {
			Map<String, String> newValues = new HashMap<>(interpretation.getValues());
			newValues.put(var.getName(), value);
			Interpretation newInterpretation = new Interpretation(newValues);
			
			if (post.eval(newInterpretation)) {
				return true;
			}
		}
		return false;
	}
}