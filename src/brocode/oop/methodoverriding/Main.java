package brocode.oop.methodoverriding;

public class Main {
	/*
     * Method Overriding = Declaring a method in subclasses
     * which is already present in parent class.
     * done so that a child class can give its own implementation
     */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animal animal = new Animal();
        Dog dog = new Dog();
        dog.speak();
        animal.speak();
	}

}
