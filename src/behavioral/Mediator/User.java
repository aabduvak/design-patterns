package behavioral.Mediator;

public abstract class User {
	protected String name;
	protected IServer server;
	
	public User(String name, IServer server) {
		this.name = name;
		this.server = server;
	}
	
	public abstract void send(String message);
	
	public abstract void receive(String message);
}
