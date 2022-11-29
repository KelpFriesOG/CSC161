package basics;

import basics.OOP.Car;

public class August_1_2022 {
	
	/* Objects and Classes 
	 * 
	 * Methods are an objects's behavior, and it also has attributes
	 * What the object can do is its behavior.
	 * 
	 * */ 
	
	
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		Car myCar = new Car("Ferrari", "Enzo", 1999, "Black");
		/* We are creating an object of type car, myCar is a reference 
		variable, the datatype of the object is a car. */

	    System.out.println(myCar.brand + " " +myCar.model); 
	    /*How we get an object's properties (which are accessible unless
	    set to private within the class.*/
	    
	    System.out.println("Is the car older than 5 years old?: "+
	    	    myCar.isOutdated());
	    /* Calling a non-static method on our car object.*/
	    
	    Car.accelerate();
	    // When we call a static method, it returns the same value
	    // regardless of the car object. Therefore you call it on
	    // the class, not just the object!
	
	    Car myStupidCar = new Car();
	    /* Remember that we have a default constructor which
	     * handles initialization with no parameters! */
	    
	    Truck truck = new Truck();
	    
	    /* Slides:
	     * 
	     * Classes are constructs that define objects of the same type.
	     * A Java class uses variables to define behaviors. Additionally.
	     * a class provides a special type of methods, known as constructors,
	     * which are invoked to construct objects from the class.
	     * 
	     * A constructor with no body is a default constructor
	     * We have to define a defult constructor if we want to 
	     * initialize a class without any data and have another
	     * constructor that accepts data. Remember that the
	     * purpose of the default constructor is to create an object
	     * without passing any data.
	     * 
	     * -------------------------------------------------------
	     * Don't need to know this but...:
	     * Why do we use default constructors?
	     * If you have default values for each of your members (properties),
	     * you can still use those values for calculations without
	     * explicitly defined parameters given by a constructor.
	     * If you have static methods in your class, those methods
	     * are completely detached from the object, in other words
	     * they need to work without any user paramaters. If you
	     * are creating a reference variable only to access the static
	     * methods, you do not need anything more than the default 
	     * constructor!
	     * -------------------------------------------------------
	     * 
	     *
	     * Otherwise the default constructor is hidden but provided
	     * if no other constructor is made by the developer
	     * 
	     * UML Diagram layout
	     * 
	     * ______Class members (properties)______
	     * 
	     * property1: type1
	     * property2: type2
	     * ...
	     * 
	     * ______Methods (constructor(s) at top__
	     * 
	     * constructor1: (default constructor has no parameters)
	     * constructor2: type1 paramater1, type2 paramter2
	     * ...
	     * ...
	     * method1: return_type1
	     * method2: return_type2
	     * ...
	     * ...
	     * ______________________________________
	     * 
	     * The order of constructors when coded does not matter,
	     * we can always constructors because their name is the
	     * same name as the class.
	     * 
	     * All constructors are methods, but not all methods are constructors :)
	     * 
	     * Constructors have no return types. The constructor is what you
	     * call to initialize an object of a class.
	     * 
	     * To reference an object, assign an object to a reference variable.
	     * 
	     * ClassName objRef = new ClassName();
	     * Notice that the constructor is invoked in the latter
	     * half of the line.
	     * 
	     * Referencing an object's data (look at line 20)
	     * member1_type var = objRef.member1
	     * 
	     * Default values for uninitialized parameters:
	     * ints: 0
	     * chars: '\u0000'
	     * double: 0.0d
	     * String (or any other object): null
	     * boolean: false
	     * 
	     * Read: https://docs.oracle.com/javase/tutorial/java/nutsandbolts/datatypes.html
	     * for more detail!
	     * 
	     * 
	     * */
	    
	    
	}
}
