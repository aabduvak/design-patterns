package creational.Singleton;

/*
 * Singleton Pattern
 * 
 * Java Singleton Pattern is one of the Gangs of Four Design patterns and comes in the Creational Design Pattern category. From the definition, it seems to be a very simple design pattern but when it comes to implementation, it comes with a lot of implementation concerns. The implementation of Java Singleton pattern has always been a controversial topic among developers. Here we will learn about Singleton design pattern principles, different ways to implement the Singleton design pattern and some of the best practices for its usage.
 * 
 * Singleton Pattern:
 *  - Singleton pattern restricts the instantiation of a class and ensures that only one instance of the class exists in the java virtual machine.
 *  - The singleton class must provide a global access point to get the instance of the class.
 *  - Singleton pattern is used for logging, drivers objects, caching and thread pool.
 *  - Singleton design pattern is also used in other design patterns like Abstract Factory, Builder, Prototype, Facade etc.
 * 
 * Implementation:
 * To implement a Singleton pattern, we have different approaches but all of them have the following common concepts.
 * 1. Private constructor to restrict instantiation of the class from other classes.
 * 2. Private static variable of the same class that is the only instance of the class.
 * 3. Public static method that returns the instance of the class, this is the global access point for outer world to get the instance of the singleton class.
 */

public class Singleton {
	private static Singleton instance;
	private static int id = 0;
	private int ObjectId;
	
	private Singleton() {
		id = id + 1;
		ObjectId = id;
	}
	
	public static Singleton getInstance() {
		if (instance == null) {
			instance = new Singleton(); // will create  object only once
		}
		return (instance);
	}
	
	public int getID() {
		return (ObjectId);
	}
}