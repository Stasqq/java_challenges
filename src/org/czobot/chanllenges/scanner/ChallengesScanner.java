package org.czobot.chanllenges.scanner;

import java.util.Scanner;

// scanner used to both printing request and returning value

public class ChallengesScanner {
	private static Scanner scanner = new Scanner(System.in);
	
	private static void closeScanner() {
		scanner.close();
	}
	
	public static String getString(String stringToPrint) {
		System.out.println(stringToPrint);
		
		String output = scanner.nextLine();
		closeScanner();
		
		return output;
	}
	
	public static int getInt(String stringToPrint) {
		System.out.println(stringToPrint);
		
		int output = scanner.nextInt();
		closeScanner();
		
		return output;
	}
}
