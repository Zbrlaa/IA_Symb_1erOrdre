package fr.utln.logic.firstorder;

import java.util.Map;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

@AllArgsConstructor(access = lombok.AccessLevel.PUBLIC)
@Getter
@ToString
public class Interpretation{
	private final Map<String, String> values;
}