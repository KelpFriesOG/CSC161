package basics;

import java.util.Scanner;

public class August_4_2022 {
	/* This is also technically the first class of CSC162 */
	/* Java Programming Review */

	public static void main(String[] args) {
		/*
		 * Class name
		 * 
		 * Every java program needs to have at least one class.
		 * Each class has a discriptive name. By convention,
		 * class names start with an uppercase letter.
		 * The only exception is the main class.
		 * (not camel case).
		 * 
		 */
		System.out.println("Welcome to Java!");

		// Every statement in Java ends with a semicolon
		// Every block of code (apart from one liners) are
		// defined by curly braces { }

		/*
		 * Reserved words:
		 * 
		 * character types, modifiers, and other words
		 * you cannot use to name a variable.
		 * 
		 */

		/*
		 * Blocks:
		 * 
		 * A pair of braces in a program
		 * forms a block that groups components of a program.
		 * A class is contained in a block. Loops are contained
		 * in their respective blocks, and e.t.c.
		 * 
		 */

		/*
		 * Chapter 2 Elementary Programs
		 * 
		 * Check slides for a good breakdown.
		 * 
		 * You can read input from the user via the Scanner class!
		 * 
		 * Implicit vs Explicit imports
		 * java.util.* vs java.util.Scanner
		 * 
		 * The second option makes your code marginally faster.
		 * 
		 */

		Scanner kbd = new Scanner(System.in);
		System.out.println("Enter the radius: ");
		double radius = kbd.nextDouble();
		System.out.println("The area of the circle would be: "
				+ ComputeArea(radius));
		kbd.close();

		/*
		 * Remember your numerical data types
		 * Match your scanner expectations with what you need
		 * 
		 * nextInt
		 * nextDouble
		 * nextLine
		 * next
		 * 
		 * Augmented assignment operators
		 * 
		 * i+=2 Addition assignment same as i = i + 2
		 * i-=2 Subraction assignment same as i = i - 2
		 * 
		 * Increment and decrement operators
		 * If i = 1
		 * 
		 * int j = ++i
		 * j is 2, i is 2
		 * 
		 * int j = i++;
		 * j is 1, i is 2
		 * 
		 * Casting
		 * 
		 * The practice of converting one datatype to another
		 * int i = 3.9 will not word
		 * we need to do int i = int (3.9)
		 * 
		 * However this truncates the value to 3
		 * (gets rid of values after the decimal)
		 * 
		 * If you want to work with the decimal you can use
		 * Math.round() or Math.floor()
		 * 
		 * Relational Operators
		 * Assume radius = 5'
		 * 
		 * Operator Mathematical Meaning Statement Evaluation
		 * < less than radius < 0 false
		 * <= less than or equal to radius <= 0 false
		 * > greater than radius > 5 false
		 * >= greater than or equal to radius >= 5 true
		 * 
		 * 
		 * Best Practice : Always use curly braces for flow-control statements
		 * if-else statements are two way if statements
		 * 
		 */

		if (ComputeArea(radius) > 100) {
			System.out.println("Thats a big ass circle!");
		} else {
			System.out.println("typical circle enjoyer.");
		}

		/*
		 * Logical Operators
		 *
		 * Symbol Logical Meaning
		 * && AND
		 * True when both clauses are true
		 * || OR
		 * True when at least one of the clauses are true
		 * ! Negation
		 * True when the clause is false
		 * ^ Exclusive OR
		 * True when either clause is true, false if both are true or
		 * both are false
		 *
		 * 
		 * Switch statements
		 * 
		 * These are useful to check a hierarchy of user
		 * accessibility.
		 * 
		 * Don't forget to end it off with default flow to
		 * make sure any implicitly unhandled cases are taken care off
		 * 
		 * 
		 * 
		 */

		/*
		 * Chapter 5: Loops
		 *
		 * For loops are used for iteration.
		 * A do-while loop will iterate at least once,
		 * it is often used for games and sending information
		 * to the screen.
		 * 
		 * Don't forget to increment the counter or else
		 * the loop will continue on forever.
		 * 
		 * When opening and closing loop blocks you
		 * do not need semicolons.
		 * However for a do while loop you need a
		 * semicolon after the while in the end tag
		 *
		 * The length of a string is the total amount of
		 * characters a string contains.
		 * 
		 * 
		 * Break and Continue statements
		 * 
		 * The break kicks you out of the whole block you are in.
		 * If the statment is within two layers of blocks its
		 * will kick you out of both.
		 * 
		 * The continue statements takes the program flow to one
		 * layer of blocks outside.
		 * 
		 */

		/*
		 * Methods
		 * 
		 * Methods enable reusability and readability within
		 * what could be redundant code. They are like preset
		 * procedures or formulas that you can plug into.
		 * 
		 * Check out the sum method below
		 * 
		 * Methods have parameters which are the values they
		 * accept to run the internal code of the method.
		 * 
		 * During the runtime (when a method gets invoked)
		 * we call parameters, the "arguments" of the methods.
		 * 
		 * When a variable is static you can share it across the
		 * entire class. If a method is static it firstly does
		 * not use any variables from the main method,
		 * and secondly can be invoked without an object.
		 * 
		 * You can make methods that return a particular datatype
		 * or if you use "void" then you do not return anything.
		 * 
		 * 
		 */

		/*
		 * Method Overloading
		 * 
		 * Occurs when you have two methods of the same name
		 * that take in different # of arguments and/or different
		 * types of arguments.
		 * 
		 * Typically most overloaded methods accomplish the same
		 * goal but just accomodate for different inputs
		 * (ex. sorting a string vs sorting an array,
		 * min of two numbers vs min of an array).
		 * 
		 * Most of the procedure tends to stay the same,
		 * at least logically you are making the same type of comparisons
		 * with the same type of flows.
		 * 
		 */

	}

	public static double ComputeArea(double r) {
		return Math.PI * r * r;
	}

	public static int sum(int min, int max) {
		int sum = 0;
		for (int i = min; i <= max; i++) {
			sum += i;
		}
		return sum;
	}

}
