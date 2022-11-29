package basics;
public class Welcome {
	
	static void fullName(String fname) {
	    System.out.println(fname + " Chavan");
	  }
	
	static int plus(int x, int y) {
		// Method to add together two integers
		  return x + y;
	  }

	static double plus(double x, double y) {
		// Method to add together two doubles
		  return x + y;
	  }

	
	public static void main(String[] args) {
		
		/* Block
		 * comments */
		// Single line comments
		
		// Testing print functionality
		System.out.println("I am a computer, beep boop.");
		
		// Testing simple methods
		fullName("Kalpesh");
	    fullName("Summer");
	    fullName("Homer");
	    
	    // Testing method overloading
	    System.out.println("int: " + plus(1, 2));
	    System.out.println("double: " + plus(3.141, 1.618));
	    
	    /* Basic Data Types */
	    
	    
	    @SuppressWarnings("unused")
		int num = 3;               // Integer (whole number)
	    @SuppressWarnings("unused")
	    float floatNum = 3.141f;    // Floating point number
	    @SuppressWarnings("unused")
	    char letter = 'D';         // Character
	    @SuppressWarnings("unused")
	    boolean truth = true;       // Boolean
	    @SuppressWarnings("unused")
	    String text = "kelp";     // String
	    
	    /* Primitives */
	    byte myByte = 100; // Range: [-128, 127], Size: 1 byte
	    System.out.println(myByte);
	    
	    short myShort = 5000; // Range: [-32768, 32767], Size: 2 bytes
	    System.out.println(myShort);
	    
	    int myInt = 100000; // Range: [-2147483648, 2147483647], Size: 4 bytes
	    System.out.println(myInt);
	    
	    long myLong = 15000000000L; // Range: [-9223372036854775808, 9223372036854775807], Size: 8 bytes
	    System.out.println(myLong);
	    
	    float myFloat = 19.9999879231331f; // Precision: 6-7 digits beyond decimal point, Size: 4 bytes
	    System.out.println(myFloat);
	    
	    double myDouble = 19.9999879231331d; // Precision: 15 digits beyond decimal point, Size: 8 bytes
	    System.out.println(myDouble);
	    
	    /* Scientific Notation */
	    
	    double d1 = 12E4d;
	    System.out.println(d1);
	    
	    /* Boolean Statements */
	    boolean isPythonBetter = true;
	    boolean isKelpSmart = false;
	    System.out.println(isPythonBetter);     // Outputs "true"
	    System.out.println(isKelpSmart);   		// Outputs "false"
	    
	    // Characters can be addressed via ASCII values
	    char letter1 = 75, letter2 = 69, letter3 = 76, letter4 = 80;
	    System.out.print(letter1);
	    System.out.print(letter2);
	    System.out.print(letter3);
	    System.out.print(letter4);
	    
	    /* Primitives vs Non-Primitive (user defined) Types*/
	    
/* --> Primitive types are predefined (already defined) in Java. Non-primitive types are created by the programmer and is not defined by Java (except for String).
   --> Non-primitive types can be used to call methods to perform certain operations, while primitive types cannot.
   --> A primitive type has always a value, while non-primitive types can be null.
   --> A primitive type starts with a lowercase letter, while non-primitive types starts with an uppercase letter.
   --> The size of a primitive type depends on the data type, while non-primitive types have all the same size.
   
   Examples of non-primitive types are Strings, Arrays, Classes, Interface, etc. 
   
   Source: https://www.w3schools.com/java/java_data_types_non-prim.asp*/
	}
}
