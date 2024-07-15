package lang.tasks;

import java.util.stream.Collectors;

public class ReverseLetter {
	
	public static String reverseLetter(final String str) {
		return  new StringBuilder(str).reverse().toString().chars()
				.mapToObj(i -> (char)i)
				.filter(ch -> Character.isLetter(ch))
				.map(c->c.toString())
				.collect(Collectors.joining());
	}
	
	public static String reverseLetterOptimal(final String str) {
		return new StringBuilder(str.replaceAll("[^a-zA-Z]", "")).reverse().toString();
	}
	
}
