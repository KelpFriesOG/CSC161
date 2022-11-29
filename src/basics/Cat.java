package basics;

public class Cat {
	String color = "brown";

	String name = "";
	int age = 0;
	private boolean talks = false;
	
	public Cat() { // Default constructor
		
	}
	
	public Cat(String name) {
		this.name = name;
	}
	
	public void noise() {
		System.out.println("WOOF!");
	}
	
	public void walk() {
		System.out.println("Cat is now walking!");
	}
	
	public void eat() {
		System.out.println("Cat is eating its meal!");
	}
	
	public void printName() {
		System.out.println("Your cat's name is "+name);
	}

	public boolean isTalks() { 
		// Allows us to get the private variable
		return talks;
	}

	public void setTalks(boolean talks) { 
		// Allows us to set the private variable
		this.talks = talks;
	}
	
	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
}
