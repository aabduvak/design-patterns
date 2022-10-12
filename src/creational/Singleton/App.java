package creational.Singleton;

public class App {
	public static void main(String[] args) {
		Singleton instance = Singleton.getInstance(); // create new instance of object
		System.out.println(instance.getID()); // check id of object
		
		Singleton newInstance = Singleton.getInstance(); // get new instance
		System.out.println(newInstance.getID()); // check id of object
		
		System.out.println(newInstance.equals(instance)); // check if instance is same object with newInstance
	}
}
