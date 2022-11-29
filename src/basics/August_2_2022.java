package basics;

import java.util.Arrays;
// import java.util.Date;
// import java.util.Random;

public class August_2_2022 {
	public static void main(String[] args) {
		// Date tracker = new Date();
		// Random random = new Random();

		/*
		 * Date Class is a prebuilt class in Java:
		 * 
		 * UML Diagram
		 * 
		 * Date
		 * +Date()
		 * +Date(elapseTime: long)
		 *
		 * +toString(): String Returns string representation of date and time
		 * +getTime(): long Returns the number of milliseconds since Jan 1, 1970 GMT
		 *
		 * +setTime(elapseTime: long): void Sets a new elapse time in the object
		 *
		 * --------------------------------------------------------------------
		 *
		 * Instance variables belong to a specific instance of a class
		 * Instance methods belong to a specific instance of a class
		 *
		 * Static variable or methods in a class are shared between all instances
		 * in a class. Static constants are final variables shared by all
		 * instance of the class.
		 *
		 * When a method is declared static in a class, then you cannot use
		 * non-static members in the body of the method. The non-static members
		 * belong to a specific instance of a class, so they cannot be used
		 * to compute values for the entire class.
		 *
		 * TLDR: Non-static variables cannot be used in static methods.
		 *
		 * final and static do not do the same thing! there is no relation.
		 * 
		 * When a variable is final it is a constant within a class, but that
		 * does not imply that it is shared between instances of classes like
		 * static variables.
		 * 
		 * final is a keyword which will be used in classes to avoid inheritance
		 * or overriding. This will be used later! So in general do not use final
		 * as a modifier for your class members.
		 * 
		 * _______________________________________________________________________
		 * 
		 * A package is a group of similar utility classes. Classes within packages
		 * have access to one another. If you do not have the public access modifier
		 * in front of a class, then the default access modifier is applied.
		 * 
		 * If your class is public then the classes can be used between packages.
		 * Otherwise the usage of your class is limited to the package it is in.
		 * 
		 * Private access modifiers on classes prevent the class from being
		 * accessed from outside of it. Basically you cannot instantiate objects
		 * from private classes!
		 * 
		 * ________________________________________________________________________
		 * 
		 * We use getters and setters to retrieve and change a class's private members.
		 * 
		 * If you have a test class in the same package as the object's class
		 * 
		 * You have access to default and public methods,
		 * you DO NOT have access to private methods and you cannot invoke private
		 * members wihout getters and setters!
		 * 
		 * Remember that regardless of member type, constructors
		 * always allow you to declare the initial values of any
		 * class members despite their private or default modfier!
		 * 
		 * Remember that getters and setters are public methods that expose private
		 * variables for manipulation! They are meant to be public so that
		 * we can change private members of the class.
		 * 
		 * data fields are private to maintain secrecy for vunerable data.
		 * 
		 * Encapsulation is the practice of utilizing private fields (members)
		 * by default to give limited access to
		 * 
		 * 
		 * A class is immutable when all its members are private
		 * and none of those members have getters or setters.
		 * 
		 * This means that after you construct an object from the class
		 * you have no way to change its members externally,
		 * it is IMMUTABLE or unchangeable after declaration.
		 * 
		 * Method overloading applies to constructors tyoo!
		 * You have already seen this!
		 * Constructors need to have the same name as the class,
		 * so when you have more than one constructor,
		 * then the constructor is chosen based on how the
		 * reference variable is initialized via the constructor.
		 * 
		 */

		Cat[] cats = new Cat[10];
		// This an array of objects, specifically cats that go meow!
		System.out.println(Arrays.toString(cats));

	}
}
