package basics;

import java.util.Scanner;
import java.util.Random;

public class July_27_2022 {
	
	/* Method Overriding, Overloading, and Arrays*/
	
	// Method that prints out a message n times
	public static void nPrintln(String message, int n) {
		for (int i = 0; i < n; i++) {
			System.out.println(message);
		}
	} 
	
	// stringToHex method for fun ;/
	//public static void stringToHex(String string) {
	//	
	//}
	
	
	
	/* Example of method overloading */
	
	// 1
	public static int max(int n1, int n2) {
		return 0;
	}
	
	// 2
	public static double max(double n1, double n2) {
		return 1;
	}
	
	// Same name, same body, but different parameters.
	// If we called max with double arguments, it would
	// execute the second method.
	// If we called max with int arguments, it would
	// execute the first method.
	
	// We did not cover method overriding but it involves polymorphism
	// and is similar in the sense that it involves methods with identical names
	
	
	/* Basically overloading gives the flexibility of
	 * implementing methods with identical names that perform
	 * differently based on the type of inputs received.
	 * 
	 * Note that the body of two identically named methods 
	 * do not need to have the same inner code
	 * but in most cases it makes logical sense to do an
	 * identical or similar procedure in both methods while just
	 * accomodating for the types.
	 * 
	 * */
	
	/* Ambigious Invocation Error: 
	 * more context if you need it: 
	 * https://www.knowledgeboat.com/question/what-is-an-ambiguous-invocation-give-an-example--28522713099034750
	 * 
	 *  Local variable is defined inside of a method or in a
	 *  block of code. 
	 *  
	 *  Global variables are accesible throughout the main
	 *  method. 
	 *  
	 *  The scope of variables in the main method is limited to
	 *  anything within the main method. If you make a method outside
	 *  the main method and try to call a variable declared in the main
	 *  method, you will get an error.
	 *  
	 *  The scope of variables declared in a for, while, or
	 *  do-while loop loop is limited
	 *  to the loop's body.
	 *  
	 *  */
	
	/*----------------------------------------*/
	
	@SuppressWarnings("unused")
	public static void main(String []args) {
		
		for(int i = 0; i < 10; i++) {
			for(int j = 10; j < 100; j*=2) {
				System.out.println("Hello World, i: "+i);
			}
		}
		
		// The scope of j : only usable in the innermost loop
		// The scope of i : only usable in the the outermost loop
		
		// i can in any code inside of the first loop, including 
		// inside the innermost loop. (You can see that I can print 
		// the value of i in the innermost loop without issue).
		
		for(int a = 0; a < 5; a++) {
			System.out.println(a+1+"th iteration of loop1");
		}
		
		for(int a = 0; a < 5; a++) {
			System.out.println(a+1+"th iteration of loop2");
		}
		
		// We can reuse a because the declaration of a is localized each loop
		
		/* Benefits of methods: Reusability, readability, 
		 * less typing (less programming complexiety)
		 * 
		 * When debugging line by line for method calls, remember to step into
		 * a method, and put a breakpoint in the method beforehand.
		 * 
		 * */
		
		/* Design diagrams help layout methods which call and are intertwined with
		 * other methods. You can call a method from within another method.
		 * In python this concept is called compartmentalizing, similar situation in Java!
		 * 
		 * Stepwise Refinement (don't need to know):
		 * This is typically called "top down design", but it more a philosophy than
		 * a rulebook. When you work on your small code it is not that useful.
		 * However for larger, work-related or cooperative projects its the goto process.
		 * 
		 * 1. Break down a task into a sequence of tasks and goals
		 * 2. Breaking a problem into two steps rather than 1.
		 * This entails analyzing all possible solutions or cases and then coding
		 * as to account for them.
		 * 3. Test your code after you finish it, do this process for each subtask
		 * Basically if all the pieces work, then minimal chances for error occur
		 * when assembling the bigger picture.
		 * 4. Structuring your code and especially loops for readability.
		 * Basically make sure you loops are understandable at a glance,
		 * especially when dealing with lots of data.
		 * 
		 * There is a lot more, but those are some fundamental principles.
		 * Stepwise refinement is applicable to all languages, and all fields of
		 * computer science study :)
		 * 
		 * */
		
		/* Arrays !!!! */ 
		
		/* Single Dimensional Arrays 
		 * 
		 * Ben: "An array is a collection of things" :D
		 * 
		 * If you buy things from the supermarket, you put them in your cart
		 * the cart is the array which holds certain objects!
		 * 
		 * An array is a data structure that represents a collection of the 
		 * same types of data. (In python data types don't matter, but here
		 * developers need to explicitly declared for the array)
		 * 
		 * */
		
		double[] myList = new double[10];
		// Declaration format: datatype[] name = new datatype[size]
		// Arrays come with a predetermined size (you need to know 
		// the size of your array before you can work with it!

		double[] myList2;
		myList2 = new double[5];
		// You can also break it into two lines, but why would you?
		
		double[] myList3 = {1.0, 1.5, 2.0, 2.5, 3.0};
		// You can also declare a list with its values aleady filled in!
		
		myList2[0] = 0;
		myList2[1] = 0.5;
		myList2[2] = 0.8;
		myList2[3] = 1.0;
		myList2[4] = 2.2;
		// Alternatively you could assign values separately.
		
		double num = myList[5]; // An array has indexes similar to working with strings
		// Recall that a string is an array of characters!
		// Similarly, an array of any type has indexes.
		// The indexes go from 0 to n-1 (similar to strings) and they refer
		// to a position or slot in the array.
		
		System.out.println(myList2.length); // returns 5
		
		// Arrays which are not filled have default values.
		// The default for primitives is 0, for chars is the unicode \u0000
		// and for booleans is False.
		
		
		myList2[2] = 3.14; // Note that previously MyList2[2] was declared as
		// 0.8. This line overwrites that value!
		
		System.out.println(myList2[2]); // returns 3.14
		
		// Indexes indicate the n+1th position in the array because
		// they go from 0 to n-1.
		
		/* Tracing programs with arrays (try adding breakpoints here) */
		
		int[] values = new int[5];
		for(int i = 1; i <5; i++) {
			values[i] = i + values[i-1];
			// The value at each index after 1 wil be set to index plus entry at previous location
			// Resulting tabular view after final iteration:
			/* Index	Value
			 * 0 		0
			 * 1 		1
			 * 2 		3
			 * 3 		6
			 * 4 		10*/
		}
		
		values[0] = values[1] + values[4];
		// Adds the value at the second and fifth slots and puts the
		// results in the first slot.
		
		/* A potential way for user to give all values for an array of size
		 * that the user chooses! */
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the size of the list");
		int size = input.nextInt();
		
		double[] userList = new double[size];
		
		for(int i = 0; i < size; i++) {
			System.out.println("What is value in position "+ (i+1) +"?");
			double entry = input.nextDouble();
			userList[i] = entry;
		}
		
		// Printing an array
		for(int i = 0; i < size; i++) {
			if(i == 0) {
				System.out.print("[ "+userList[i]+ ", ");
			}
			else if(i == size-1) {
				System.out.print(userList[i]+" ]\n");

			}
			else {
				System.out.print(userList[i]+", ");
			}
		}
		
		
		/* Initializing an array with random values */
		size = 15;
		Random random = new Random();
		int[] randomList = new int[size];
		
		for(int i = 0; i < size; i++) {
			random.nextInt(0,100);
		}
		
		/* Finding the largest element in an array */
		double[] maxList = {0.0, 2.0, 19.0, 17.0, 12.0, 55.3, 55.1};
		
		
		/* Enhanced For Loops */
		String[] enhancedList = {"Kelp", "eats", "a", "lot", "of", "pizza"};
		
		for(String value: enhancedList) {
			// Built in iterator / counter!
			// The iteration happens but you do not see it!
			// The iterator, which is called "value" stores the value
			// in every iteration
			System.out.print(value+ " ");
		}
		
		// Copying arrays
		
		int[] source = {1, 3, 5, 7, 9};
		int[] target = new int[source.length];
		
		for(int i = 0; i< source.length; i++){
			target[i] = source[i];
		}
		
		// Shortcut for that with built in methods
		int[] target2 = source.clone();
		
		// Well why can you not set an array equal to another?
		// You can try it!
		
		int[] target3 = source;
		
		input.close();
		
		/* This works but does not create a new array.
		 * Instead target3 refers to the same location (in your memory)
		 * as the source array. They point to the same location,
		 * they are NOT two separate arrays!
		 * 
		 * If you make changes to source, it reflects in the target3 array.
		 * In most cases you do not want any changes to the source array to
		 * affect the target array, so its best practice to avoid the "a=b"
		 * approach!
		 * 
		 * */
		
		
	}
	
}
