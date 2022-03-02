package org.czobot.fizzbuzz;

import org.czobot.chanllenges.scanner.ChallengesScanner;

public class FizzBuzz {

	public static void main(String[] args) {
		int n = ChallengesScanner.getInt("Enter FizzBuzz number:");
		
		if(n > 0) {
			System.out.println("\n\nFizzBuzz:\n");
			
			fizzBuzz(n);
			
			System.out.println("\nEnd");
		} else {
			System.out.println("Given number must be greater than 0");
		}
	}
	
	public static void fizzBuzz(int n) {
		
		for(int i = 1; i <= n; i++) {
			if(i%15 == 0)
				System.out.println("FizzBuzz");
			else if(i%5 == 0)
				System.out.println("Fizz");
			else if(i%3 == 0)
				System.out.println("Buzz");
			else
				System.out.println(i);
		}
	}

}
