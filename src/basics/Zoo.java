package basics;

public class Zoo {
	public static void main(String[] args) {
	
		Dog brian = new Dog("brian");
		Dog strayDog = new Dog();
		
		brian.setAge(3);
		
		System.out.println(brian.getAge());
		
		Cat mininu = new Cat();
		mininu.noise();
		
		olaEats(mininu);
		
	}
	
	public static void olaEats(Cat Ola) {
		Ola.eat();
	}
}
