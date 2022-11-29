package basics;

import java.util.Scanner;

public class July_18_2022 {
	/* Midterm on July 21st Topics: Chapter 1,2,3,5 */
	/* Chapter 4 was strings and string manipulation.
	 * 
	 * 
	 * Chapter 5: Loops
	 * 
	 * There are 2 types of loops: for-loops and while loops
	 * 
	 * Motivation:
	 * Suppose you need to print a string a certain amount of times.
	 * Instead of typing System.out.println("Hello") 100 times.
	 * we will use loops.
	 *
	 * 
	 * */
	
	public static void main(String[] args) {
		
		int count = 0;
		while (count < 100) {
			System.out.println("Welcome to Java! (iteration "+(count+1)+")");
			count++;
		}
		
		System.out.println(count);
		System.out.println("Hello\n".repeat(5)); // If you hate loops!
		
	/* The first iteration of the loop occurs when count = 0
	 * here the count is less than a 100, so it will enter the loop.
	 * The first line prints the statement, the second line
	 * increases the value of count by 1. Then the value of count
	 * for the second iteration will be 1, which is less than 100,
	 * then we will enter the loop.
	 * 
	 * This will go on for 100 iterations
	 * 
	 * Iteration:		Value of Count
	 * 1				0
	 * 2				1
	 * 3				2
	 * .				
	 * .
	 * .
	 * 100				99
	 * 
	 * When the value of count becomes 100, 
	 * and we check that 100 < 100.. it does not.
	 * The condition evaluates to false so we no longer enter the loop
	 * and skip past the entire loop to the next line of execution.
	 * 
	 * If we do not iterate the value of count via the line
	 * count++, then the loop will be executed an infinite number of times.
	 * 
	 * 
	 * */
	
	count = 0; // Resetting count
	
	while(count == -1) {
		System.out.println(" While Loop: Welcome to Java!");
		count++;
	}
	
	System.out.println(count);
	
	count = 0; // Resetting count
	
	do {
		System.out.println(" Do-While Loop: Welcome to Java! ");
		count++;
	} while(count == -1); // Note that the do-block ends with 
	// the brace so the proceeding while statement needs a semicolon.
	
	System.out.println(count);
	
	// When you run lines 62-76 note that the Do While loop runs and then checks the condition.
	// The regular while loop does not even execute to begin with, because the condition is checked
	// before entering the block of code and it evaluates to false so the loop is skipped
	
	/* IMPORTANT: DO-WHILE loops execute at least one time, regardless of whether or not the condition
	 * for running is initially met. */
	
	count = 0; // Resetting count
	
	do {
		System.out.println(" Do-While Loop: Welcome to Java! (iteration "+(count+1)+")");
		count++;
	} while(count < 5);
	
	// Given count < n, for some n int, both do-while and while loops execute n times.
	
	}
	
	static void Example1() {
		int number1 = (int) (Math.random()*10); // Generates number 0-9
		int number2 = (int) (Math.random()*10); // Generates number 0-9
		
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		
		System.out.println("What is "+number1+" + "+number2+" ?");
		int answer = input.nextInt();
		
		while (number1 + number2 != answer) {
			System.out.println("Wrong number. Try again!");
			System.out.println("What is "+number1+" + "+number2+" ?");
			answer = input.nextInt();
		}
		
		System.out.println("You got it!");
	}
	

}
