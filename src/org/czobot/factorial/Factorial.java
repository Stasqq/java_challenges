package org.czobot.factorial;

import org.czobot.chanllenges.scanner.ChallengesScanner;

public class Factorial {
	
	public static void main(String[] args) {
		int n = ChallengesScanner.getInt("Enter integer for factorial: ");
		
		System.out.println("Factorial for " + n + " is: " + factorial(n));
	}
	
	public static int factorial(int n) {
		if(n == 0) {
			return 1;
		}
		
		if(n < 0) {
			throw new RuntimeException("Wrong factorial number: " + n);
		}
		
		return (n == 1) ? 1 : factorial(n-1) * n;
	}
}
