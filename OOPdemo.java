/* OOPS
1) Classes - Blueprint of objects; collection of methods & attributes

2) Objects - Instance of a class; represents real-world entities; can access classes using objects.

3) Abstraction - Hiding irrelevant details/data; hiding the code complexity
    abstract - partial hiding/complete hiding(flexible)
    interface - complete hiding only(fixed)
    class-class, interface-interface = extends
    class-interface=implements
    interface - rules of the game and classes - the players that abide by those rules while adding their unique style.

4) Encapsulation - Binding data & methods into a class; hiding the internal working.
    use get,set methods - for private access modifiers

5) Polymorphism - The ability of an object to be present in more than 1 form.
    5.1)Method Overloading - compile time(static polymorphism), same function/method name-diff parameters
    5.2)Method Overriding - run time(dynamic polymorphism), same function/method name-same parameters, implemented using interfaces

6) Inheritance - The process of inheriting properties & behaviours from another class.
    6.1)Single Level Inheritance - Single parent-single child
    6.2)Hierarchical Inheritance - Single parent-single child(1 parent - 2 children, 2 parent - 4 children)
    6.3)Multi-level Inheritance - Single grandparent-Single parent-single child
    6.4)Multiple Inheritance - Dual parent-Single child
    6.5)Hybrid Inheritance - combines different inheritance types, like single, multiple, and hierarchical, within one structure.
*/

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
        dog.eat(); // Inherited method
        dog.run(); // Method from the CanRun interface

        // Inheritance demonstration
        Animal animal = new Dog();
        animal.eat(); // Inherited method
        animal.makeSound(); // OverrCaridden method in Dog class

        // Polymorphism demonstration (method overriding)
        Animal myDog = new Dog();
        myDog.makeSound(); // Dog's implementation of makeSound()

        // Composition demonstration
        // Composition is about having a "whole" (like a car) that contains parts (like an engine), and using them directly.
        Car car = new Car();
        car.startCar();

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

    // Public setter method
    public void setName(String name) {
        this.name = name;
    }

    // Public getter method
    public String getName() {
        return name;
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

    public void startCar() {
        engine.start(); // Delegation
        // Delegation is about passing off tasks (like starting the engine) to another object (like the engine) to perform, instead of doing the task yourself.
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