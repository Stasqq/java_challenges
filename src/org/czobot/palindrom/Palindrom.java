package org.czobot.palindrom;

import org.czobot.chanllenges.scanner.ChallengesScanner;

public class Palindrom {

	public static void main(String[] args) {
		
		String inputString = ChallengesScanner.getString("Enter string to check if it is palindrom:");
		
		System.out.println("PalindromByReverseStringComparison: " + isPalindromByReverseStringComparison(inputString));
		System.out.println("PalindromByCharComparison: " + isPalindromByCharComparison(inputString));
	}

	public static boolean isPalindromByReverseStringComparison(String inputString) {
		if(isStringIncorrect(inputString)) {
			return false;
		}
		
		inputString = inputString.toLowerCase();
		
		String reverseString = reverseString(inputString);
		if(inputString.equals(reverseString))
			return true;
		else
			return false;
	}
	
	public static boolean isStringIncorrect(String stringToCheck) {
		return (stringToCheck == null || stringToCheck.isEmpty());
	}
	
	public static String reverseString(String inputString) {
		StringBuilder stringBuilder = new StringBuilder(inputString);
		return stringBuilder.reverse().toString();
	}
	
	public static boolean isPalindromByCharComparison(String inputString) {
		if(isStringIncorrect(inputString)) {
			return false;
		}
		
		inputString = inputString.toLowerCase();
		
		int strLength = inputString.length();
		
		for(int i = 0; i < strLength / 2; i++) {
			// comparing chars at beginning with chars at end
			if(inputString.charAt(i) != inputString.charAt(strLength - 1 - i))
				return false;
		}
		
		return true;
	}
}
