package behavioral.Template;

/*
 * In Template pattern, an abstract class exposes defined way(s)/template(s) to execute its methods. 
 * Its subclasses can override the method implementation as per need but the invocation is to be 
 * in the same way as defined by an abstract class. This pattern comes under behavior pattern category.
 * 
 * Implementation steps:
 * 1. Create abstract class with a template method being final
 * 2. Create concrete classes extending the above class.
 * 3. Implement all abstract methods in child class.
 * 
 * Detailed articles:
 * https://www.tutorialspoint.com/design_pattern/template_pattern.htm
 * https://www.geeksforgeeks.org/template-method-design-pattern/
 * https://www.digitalocean.com/community/tutorials/template-method-design-pattern-in-java
 */

public abstract class Game {
	abstract void initialize();
	abstract void startGame();
	abstract void endGame();
	
	public final void play() { // template method
		// calling all methods here
		initialize();
		startGame();
		endGame();
	}
}