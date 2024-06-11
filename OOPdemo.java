// Main class to demonstrate all OOPS concepts
public class OOPdemo {

    public static void main(String[] args) {
        // Encapsulation demonstration
        Person person = new Person();
        person.setName("John Doe");
        System.out.println("Encapsulation: Person's name is " + person.getName());

        // Abstraction demonstration with class and method
        Dog dog = new Dog();
        dog.makeSound(); // Dog's implementation of makeSound()
        dog.eat();       // Inherited method
        dog.run();       // Method from the Animal interface

        // Inheritance demonstration
        Animal animal = new Dog();
        animal.eat();    // Inherited method
        animal.makeSound(); // Overridden method in Dog class

        // Polymorphism demonstration (method overriding)
        Animal myDog = new Dog();
        myDog.makeSound(); // Dog's implementation of makeSound()

        // Composition demonstration
        Car car = new Car();
        car.start();

        // Method Overloading demonstration
        MathOperations mathOps = new MathOperations();
        System.out.println("Method Overloading: Add integers: " + mathOps.add(5, 10));
        System.out.println("Method Overloading: Add doubles: " + mathOps.add(5.5, 10.5));

        // Access Modifiers demonstration
        AccessModifiersDemo accessDemo = new AccessModifiersDemo();
        System.out.println("Access Modifiers: " + accessDemo.publicVar);
        // accessDemo.privateVar; // Error: privateVar is private
        System.out.println("Access Modifiers: " + accessDemo.getPrivateVar());
        System.out.println("Access Modifiers: " + accessDemo.protectedVar);
        System.out.println("Access Modifiers: " + accessDemo.defaultVar);

    }
}

// Encapsulation
class Person {
    private String name; // Private variable

    // Public getter method
    public String getName() {
        return name;
    }

    // Public setter method
    public void setName(String name) {
        this.name = name;
    }
}

// Abstraction
abstract class Animal { 
    // Abstract method (does not have a body)
    public abstract void makeSound();

    // Concrete method
    public void eat() {
        System.out.println("This animal eats food");
    }
}

// Interface for abstraction and multiple inheritance
interface CanRun {
    void run();
}

// Inheritance and Polymorphism (method overriding)
class Dog extends Animal implements CanRun {
    // Dog's implementation of the abstract method makeSound
    public void makeSound() {
        System.out.println("Dog barks");
    }

    // Implementation of interface method
    public void run() {
        System.out.println("Dog runs");
    }
}

// Composition
class Engine {
    public void start() {
        System.out.println("Engine starts");
    }
}

class Car {
    private Engine engine; // Car has an Engine (Composition)

    public Car() {
        this.engine = new Engine();
    }

    public void start() {
        engine.start(); // Delegation
        System.out.println("Car starts");
    }
}

// Method Overloading
class MathOperations {
    // Overloaded method for adding integers
    public int add(int a, int b) {
        return a + b;
    }

    // Overloaded method for adding doubles
    public double add(double a, double b) {
        return a + b;
    }
}

// Access Modifiers demonstration
class AccessModifiersDemo {
    public String publicVar = "Public Variable";
    private String privateVar = "Private Variable";
    protected String protectedVar = "Protected Variable";
    String defaultVar = "Default Variable"; // Package-private

    // Getter for private variable
    public String getPrivateVar() {
        return privateVar;
    }
}

// Multilevel Inheritance
class AnimalParent {
    public void sleep() {
        System.out.println("This animal sleeps");
    }
}

class AnimalChild extends AnimalParent {
    public void walk() {
        System.out.println("This animal walks");
    }
}

class DogChild extends AnimalChild {
    public void play() {
        System.out.println("This dog plays");
    }
}
