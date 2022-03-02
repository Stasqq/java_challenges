package org.czobot.fizzbuzz;
import java.util.Scanner;

public class FizzBuzz {

	public static void main(String[] args) {
		
		Scanner inputScaner = new Scanner(System.in);
		
		System.out.println("Enter FizzBuzz number:");
		
		int n = inputScaner.nextInt();

		inputScaner.close();
		
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
