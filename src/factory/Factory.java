package factory;

/**
 * Factory design pattern is used when we have a superclass with multiple sub-classes and 
 * based on input, we need to return one of the sub-class. This pattern takes out the 
 * responsibility of the instantiation of a class from the client program to the factory 
 * class.
 * 
 * Super class in factory design pattern can be an interface, abstract class or a 
 * normal java class
 */

public class Factory {
	public static Computer getComputer(String type, String ram, String ssd, String cpu) {
		if ("pc".equalsIgnoreCase(type))
			return new PC(ram, ssd, cpu);
		else if ("server".equalsIgnoreCase(type))
			return new Server(ram, ssd, cpu);
		return (null);
	}
}
