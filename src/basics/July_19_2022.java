package basics;

public class July_19_2022 {
	
	/* For Loops */
	
	public static void main(String []args) {
		
		for(int i = 0; i < 2; i++) {
			System.out.println("Welcome to Java!");
		}
		
		// The for loop above will execute twice
		/* Iteration	Value of i		Executes?
		 * 		1			0				Yes
		 * 		2			1				Yes
		 * 		3			2				No
		 * 
		 * For all values of i equal to or greater than
		 * 2, the code block is skipped.
		 * 
		 * You use while loops when you need to print based
		 * on a condition (which may or may not involve math). 
		 * You use for loops to iterate when
		 * the condition is mathematically well defined inequality
		 * (i.e. something < 10).
		 * 
		 * Loops do not terminate their first line with a semicolon.
		 * Their blocks are defined via curly braces 
		 * (no semicolon needed)
		 * 
		 * However, a do while loop's block is technically ending after
		 * the last curly brace which defines the do portion. The while
		 * statement after needs a terminating semicolon.
		 * 
		 * */
		
		/* Nested Loops 
		 * 
		 * A loop inside of a loop
		 * There will be no test or assignments on this! :)
		 * 
		 * If loop 1 iterates 3 times and loop 2 iterates 2 times,
		 * if the counter variables of independent of each other:
		 * 
		 * Loop1{
		 * 	Loop2{
		 * 	}
		 * }
		 * 
		 * will execute the innermost code block (3*2) 6 times!
		 * 
		 * Similarly:
		 * 
		 * Loop2{
		 * 	Loop1{
		 * 	}
		 * }
		 * 
		 * will execute the innermost code block 6 times!
		 * 
		 * */
		
		/* Checking a palindrome with a loop on the string! Use low high strategy!
		 * 
		 * A prime number is a number which is divisible by 1 or itself.
		 * 
		 * We can use for loops to get the first x primes in a range!
		 * Since this is a mathematical operation and condition check
		 * you can use for or while loops!
		 * 
		 * 
		 * 
		 *  */
		
		

	}
	
}
