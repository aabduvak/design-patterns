package behavioral.Mediator;

public class App {
	public static void main(String[] args) {
		IServer server = new Server();
		User user1 = new Student("Aziz", server);
		User user2 = new Student("Ayse", server);
		User user3 = new Student("Nurullah", server);
		User user4 = new Student("Nisa", server);
		server.addUser(user1);
		server.addUser(user2);
		server.addUser(user3);
		server.addUser(user4);
		
		user1.send("Hi All");
	}
}
