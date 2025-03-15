// Java Program to implement Java Abstraction
// This Java program uses abstraction to hide specific implementation details while exposing a common interface for interacting with objects. The abstract class Animal defines what every animal must do (i.e., make a sound) without dictating how it should do it. Subclasses Dog and Cat provide the specifics, allowing the program to interact with them.

// The Abstract class encapsulates the common aspect ("name") of an animal while deferring the specifics of "making a sound" to its subclasses. This hides the implementation details of the sound-making process from the code that uses Animal objects.
// Abstract Class declared
abstract class Animal {
	// The class is declared with the abstract keyword, meaning it cannot be instantiated directly.

	private String name;

	public Animal(String name) {
		this.name = name;
	}
	// Abstract method: must be implemented by subclasses & it has no body and is a promise that every non-abstract subclass must provide an implementation for this method.
	public abstract void makeSound();
    // Concrete method: shared functionality among all animals
	public String getName() {
		return name;
	}
}

class Dog extends Animal {
	// This class inherits the name field & getName() method
	public Dog(String name) {
		super(name);
	}

	public void makeSound() {
		System.out.println(getName() + " barks");
	}
}

class Cat extends Animal {
	public Cat(String name) {
		super(name);
	}

    // @Override
	// It overrides the makeSound() method in Dog class to print a message indicating that the cat meows.
	public void makeSound() {
		System.out.println(getName() + " meows");
	}
}

// Driver Class
public class abstraction {
	// Main Function
	public static void main(String[] args) {
		Animal myDog = new Dog("Buddy");
		Animal myCat = new Cat("Fluffy");

		myDog.makeSound();
		myCat.makeSound();
	}
}
