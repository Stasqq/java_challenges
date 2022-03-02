package org.czobot.fibonacci;

import org.czobot.chanllenges.scanner.ChallengesScanner;

public class Fibonacci {

	// setting fibonacci sequence numeration statring from 0
	
	public static void main(String[] args) {
		int n = ChallengesScanner.getInt("Enter position in Fibonacci sequence:");
		
		System.out.println("In Fibonacci sequence on position " + n + " is: ");
		System.out.println("\tSimpleFibonacciByRecursion: " + simpleFibonacciByRecursion(n));
		System.out.println("\tFibonacciByLoop: " + fibonacciByLoop(n));
	}
	
	public static int simpleFibonacciByRecursion(int position) {
		if(position == 0)
			return 0;
		else if(position == 1)
			return 1;
		
		return simpleFibonacciByRecursion(position - 1) + simpleFibonacciByRecursion(position - 2);
	}
	
	public static int fibonacciByLoop(int position) {
		if(position == 0)
			return 0;
		if(position == 1)
			return 1;
		
		int[] fibonacciSequence = new int[position+1];
		
		fibonacciSequence[0] = 0;
		fibonacciSequence[1] = 1;
		
		for(int i = 2; i <= position; i++) {
			fibonacciSequence[i] = fibonacciSequence[i-1] + fibonacciSequence[i-2];
		}
		
		return fibonacciSequence[position];
	}
}
