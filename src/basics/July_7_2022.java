package basics;
import java.math.*;
import java.util.Scanner;

@SuppressWarnings("unused")
public class July_7_2022 {
	
	public static void main(String[] args) {
		
		/* Hard-coded area of circle*/
		
		double radius;
		
		// Assign a radius
		radius = 20;
		
		// Compute the area
		double area = radius * radius * Math.PI;
		
		// Print out the result
		System.out.println("The area for the circle of radius " + radius
				+ " is " + area);
		
		/* User-based area of circle */
		
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a value for radius: ");
		radius = input.nextDouble();
		
		area = radius * radius * Math.PI;
		
		System.out.println("The area for the circle "
				+ "of radius (based on user input) " + radius
				+ " is " + area);
		
		/* Declaring and assigning within one line and overwritting*/
		
		int x = 1; // Declaring and assigning within the same line
		System.out.println(x);
		x = 5; // The complier automatically dumps the old value
		// This is true for 99% of modern languages.
		System.out.println(x);
		
		/* Name constants*/
		// Format: final datatype CONSTANTNAME = VALUE;
		
		
		@SuppressWarnings("unused")
		final double PI = 3.14159;
		// The variable's value cannot be overwritten.
		
		/* Naming Conventions */
		// For class names and methods capitalize the first letters
		// of each word.
		
		// For variable names, the first word should be lowercased,
		// the following words should start with uppercase letters.
		
		
		/* Primitive Data Types */
		// Check primitives section in Welcome.java
		
		/* Reading datatypes with Scanner*/
		// nextByte() reads or expects a byte
		// nextInt() reads or expects an int
		// e.t.c.
		
		/* Integer Arithmetic */
		int a = 5;
		int b = 6;
		
		System.out.println(a + b);
		System.out.println(b - a);
		System.out.println(a * b);
		System.out.println(a / b); // If the first argument is less than the second argumentthen this shows 0
		System.out.println(b / a); // Otherwise you get the remaining proper quotient.
		System.out.println((double) b / (double) a); // If the inputs have decimals then the output will not be rounded!
		
		/* Using java.Math */
		System.out.println(Math.pow(2, 4));
		System.out.println(Math.pow(4, -0.5));
		
		/* Double vs float precision*/
		// Check Welcome.java under Primitive types and look at precision!
		// Basically floats have 7 digits of precision after the decimal.
		// Doubles have 15 digits of precision.
		
		/* Problem: Temperature Conversion */
		
		Scanner kbd = new Scanner(System.in);
		
		System.out.print("Enter a degree in Farenheit: ");
		double farenheit = input.nextDouble();
		
		// Conversion
		double celsius = (5.0 / 9) * (farenheit -32);
		// We use 5.0 so the compiler understands to do double arithmetic
		// Remember that 5 / 9 would evaluate to 0, but 5.0 / 9 evaluates to 0.5555
		System.out.println(celsius);
		
		/* Incremental Assignment operators */
		// I + 8 will give you the same result as I+=8
		// I - 8 will give you the same result as I-=8
		// I / 8 will give you the same result as I/=8
		// I % 8 will give you the same result as I%=8
		
		/* Increments and Decrements */
		// ++var --> Increments var by 1, and USES the NEW VALUE in the statement
		// var++ --> Increments var by 1, but USES the ORIGINAL VALUE in the statement.
		// --var --> Decrements var by 1, and USES the NEW VALUE in the statement.
		// var-- --> Decrements var by 1, and USES the ORIGINAL VALUE in the statement.
		
		// Examples
		int y = 2;
		double z = 4.0;
		System.out.println(y); 
		// Increments are limited by the types they are applied on
		y+=1.5; // Incrementing and int by a double: the double increment is applied
		// Since y is an int, it is rounded down from 3.5 to 3
		z+=2.5; // Incrementing a double by a double: the increment is applied as you expect!
		System.out.println(y);
		System.out.println(z);
		
		/* Numeric Type Conversions */
		// We can convert between types, but you may lose data
		double A = 3.1412;
		System.out.println((int) A);
		System.out.println((double) (int) A);
		// Notice that the line about outputs 3.0 even if you
		// converted A into a double.
		// Converting a type of more size into a type of smaller size,
		// often results in memory loss. This process in the compiler is called
		// "truncating"
	
		int sum = (int) (A + 4.23124);
		// A type conversion can be applied to an operation as a whole.
		System.out.println(sum);
		
		/* Problem : Computing a Loan */
		
		System.out.print("What is the loan amount?: ");
		@SuppressWarnings("unused")
		double loanAmount = input.nextDouble();
		
		System.out.print("\nWhat is the loan period in years? :");
		
		@SuppressWarnings("unused")
		int duration = input.nextInt();
		
		@SuppressWarnings("unused")
		double rate = 0.085; // 8.5%
		
		kbd.close();
		// I made one intentional mistake in the code, can you find it? 
		// Use scanners only once!
	}
	
	
	/* Notes:
	 * 
	 *           ____  
        o8%8888,    
      o88%8888888.  
     8'-    -:8888b   
    8'         8888  
   d8.-=. ,==-.:888b  
   >8 `~` :`~' d8888   
   88         ,88888   
   88b. `-~  ':88888  
   888b ~==~ .:88888 
   88888o--:':::8888      
   `88888| :::' 8888b  
   8888^^'       8888b  
  d888           ,%888b.   
 d88%            %%%8--'-.  
/88:.__ ,       _%-' ---  -  
    '''::===..-'   =  --.
	 * 
	 *  By Kelpy the artist :)
	 * */
}
