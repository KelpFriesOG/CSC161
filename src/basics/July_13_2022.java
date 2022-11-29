package basics;

public class July_13_2022 {
	/* Debugging
	 * 
	 * Bugs are logical errors in a program
	 * Breakpoints need to be set in order to stop allow it to
	 * execute from step by step.
	 * 
	 * */
	
	@SuppressWarnings("unused")
	public static void Main(String []args) {

		int manipulate = 3;
		
		System.out.println("There is a breakpoint in the line above!");
	}
	
	/* Mathematical functions, characters, and Strings */
	
	// So far we only used Math.pow() and Math.Random()
	
	// Mathematical functions are documented in the Math module's Oracle site.
	
	// A constant is a value that is unchangeable and uses the keyword "final".
	
	/* The math class has two constants: e and PI.
	 * 
	 * Exponent methods, trignometric functions, toRadians,
	 * all other functions are good to know for mathematical analysis.
	 * 
	 * Math.pow() is the most frequently used function.
	 * But similar functions such as exp(), log(), log10(), and sqrt()
	 * All functions are fairly self-explanatory.
	 * 
	 * ceil() and floor() round up and down to the nearest integer (respectively)
	 * 
	 * Ex.
	 * 
	 * min(a, b), max(a, b) return the lower value and upper value between the two
	 * arguments provided, respectively.
	 * 
	 * The Math.random() function has a range of [0, 1) and generates
	 * double values
	 * 
	 * int(Math.random() * 10)
	 * Math.random * 10 has a range of [0, 10)
	 * The int cast truncates this range to be [0,9]
	 * 
	 * 50 + int(Math.random() * 50)
	 * Math.random * 10 has a range of [0, 50)
	 * The int cast truncates this range to be [0,49]
	 * The +50 converts the range even further to be [50, 99]
	 * 
	 * Character Data Type
	 * 
	 * Characters can be initialized by the typed letter, symbol, or number.
	 * However, you can also use ASCII codes or UNICODEs to initialize chars
	 * 
	 * char letter = '\u0041';
	 * This letter will give us an A
	 * 
	 * char letter = '\u03b1';
	 * This letter is a greek symbol that you cannot type normally!
	 * 
	 * Escape Sequences
	 * 
	 * \b = 
	 * \t =
	 * \n =
	 * \f =
	 * \r = 
	 * \\ =
	 * \ =
	 * 
	 * Casting between characters and numbers
	 * 
	 * char c = 97;
	 * This actually works because 97 corresponds with a value in the
	 * ASCII table.
	 * 
	 * int i = 'A';
	 * This actually works because 'corresponds' with a key in the ASCII
	 * table.
	 * 
	 * Character is a class, therefore it has functions.
	 * 
	 * Character.isDigit(c)
	 * Character.isLetter(c)
	 * Character.isLetterOrDigit(c)
	 * 
	 * char is a primitive, Character is an object type
	 * A String is a reference type (an object)
	 * That is why we write String and not string.
	 * Objects are capitalized.
	 * 
	 * Methods in string object
	 * 
	 * length()
	 * charAt(index)
	 * concat(s1)
	 * toUpperCase()
	 * toLowerCase()
	 * trim()
	 * 
	 * String s3 = s1.concat(s2) is equivalent to String s3 = s1 + s2
	 * 
	 * startsWith()
	 * endsWith()
	 * 
	 * Obtaining substrings
	 * 
	 * substring(beginIndex)
	 * or the overloaded method
	 * substring(beginIndex, endIndex)
	 * 
	 * Be careful with the substring method as it stops at the endIndex-1 index.
	 * In other words the substring does not include the last index.
	 * Its range (of indexs) is [0,k). 
	 * 
	 * Since String is not a primitive data type we cannot use it to cast.
	 * Instead we have to use Integer.parseInt() and Integer.parseDouble().
	 * 
	 * Technically each primitive datatype has its own reference type.
	 * We need these reference types or objects because they contain specialized methods.
	 * 
	 * System.out.printf(format, items);
	 * 
	 * Chapter 4 endgame; woooohooooo
	 * 
	 * */
}
