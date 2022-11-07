package behavioral.Mediator;

/*
 * Mediator design pattern is one of the behavioral design pattern, so it deals with the behaviors
 * of objects. Mediator design pattern is used to provide a centralized communication medium 
 * between different objects in a system.
 * 
 * Allows loose coupling by encapsulating the way disparate sets of objects interact and
 * communicate with each other. Allows for the actions of each object set to vary independently
 * of one another.
 * 
 * Example:
 * 									  SERVER
 * 									/		\
 * 								/				\
 * 							CLIENT				CLIENT
 * 
 * Detailed article:
 *  - https://www.digitalocean.com/community/tutorials/mediator-design-pattern-java
 *  - https://www.geeksforgeeks.org/mediator-design-pattern/
 *  - https://www.gencayyildiz.com/blog/c-mediator-design-patternmediator-tasarim-deseni/
 * 
 */

public interface IServer {
	public void addUser(User user);
	
	public void sendMessage(String message, User user);
}
