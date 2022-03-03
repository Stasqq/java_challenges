package org.czobot.oldphonekeyboardconverter;

import java.util.HashMap;
import java.util.Map;

import org.czobot.chanllenges.scanner.ChallengesScanner;

public class OldPhoneKeyboardWordsConverter {
	
	public static void main(String[] args) {
		String inputString = ChallengesScanner.getString("Enter word to encode:");
		
		System.out.println("String: \"" + inputString + "\", after encoding: "
				+ convertWordToNubersSequence(inputString));
	}

	public static String convertWordToNubersSequence(String inputString) {
		StringBuilder currentNumbersSequenceStringBuilder = new StringBuilder();
		
		for(int i=0; i < inputString.length(); i++) {
			currentNumbersSequenceStringBuilder.append(convertCharToNumbersSequence(inputString.charAt(i)));
		}
		
		return currentNumbersSequenceStringBuilder.toString();
	}
	
	public static String convertCharToNumbersSequence(char inputChar) {
		if(!Character.isLetter(inputChar)) {
			throw new RuntimeException("Wrong input character: " + inputChar);
		}
				
		String lowerCaseCharacterAsString = String.valueOf(inputChar).toLowerCase();
		
		return mapper.get(lowerCaseCharacterAsString);
	}
	
	private static final Map<String, String> mapper = new HashMap<>() {
		{
			put("a", "2");
			put("b", "22");
			put("c", "222");
			put("d", "3");
			put("e", "33");
			put("f", "333");
			put("g", "4");
			put("h", "44");
			put("i", "444");
			put("j", "5");
			put("k", "55");
			put("l", "555");
			put("m", "6");
			put("n", "66");
			put("o", "666");
			put("p", "7");
			put("q", "77");
			put("r", "777");
			put("s", "8");
			put("t", "88");
			put("u", "888");
			put("w", "9");
			put("x", "99");
			put("y", "999");
			put("z", "9999");
		}
	};
	
}
