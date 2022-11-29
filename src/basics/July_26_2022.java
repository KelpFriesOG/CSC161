package basics;

public class July_26_2022 {
	
	/* Methods and shit like that*/
	
	public static int sum(int i1, int i2) { 
		// format: visibilty_modifier call_modifier return_type method_name(type1 paramater1, ...)
		int sum = 0;
		
		for(int counter = i1; counter <= i2; counter++) {
			sum+=counter;
		}
		
		return sum;
	}
	
	public static int add(int i1, int i2) {
		return i1+i2;
	}
	
	public static int subtract(int i1, int i2) {
		return i1-i2;
	}
	
	public static int max(int num1, int num2) {
		return num1 > num2 ? num1: num2;
		
	}
	
	public static void greeting() {
		// void methods cannot return anything. They usually only serve to print
		// via System.out.println
		System.out.println("Poggers");
		// We cannot assign a void method to an object b/c the method does not return
		// Just calling the method prints a value.
	}
	
	public static void main(String []args) {
		int num1 = 5;
		int num2 = 10;
		// Note that methods can accept variables of the proper type
		// or the raw value data (i.e. 10, "This" itself)
		
		
		System.out.println(sum(num1, num2)); 
		// you pass arguments, which are also called parameters 
		// when working within the method.
		
		System.out.println(add(num1, num2));
		// You shouldn't need a method to add to numbers (its a one line operation)
		/* However, for more complex and reusable procedures, methods are
		 * bread and butter and an absolute neccisity for coding. */
		
		System.out.println("The subtract method does 5-10: "+ subtract(num1, num2)); 
		// num1 corresponds with i1, num2 with i2
		System.out.println("The subtract method does 10-5: "+ subtract(num2, num1)); 
		// num2 corresponds with i1, num1 with i2
		// The order of parameters matters as well!
		
		System.out.println("The max between num1 and num2 is: "+max(num1,num2));
		// Based on the internal implementation of the funtion
		// the order technically does not matter
		
		// If a method takes in input which it cannot appropriately handled,
		// the compiler will yell at you to handle the unhandled cases.
		// For example, if you have if-else if statements, they MUST end with an else
		// To catch all the possible values which will be unhandled by the previous messages.
		
		
	}
	
}
