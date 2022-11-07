package behavioral.Mediator;

import java.util.ArrayList;

public class Server implements IServer{

	private ArrayList<User> users;
	
	public Server() {
		this.users = new ArrayList<>();
	}

	@Override
	public void addUser(User user) {
		this.users.add(user);
	}

	@Override
	public void sendMessage(String message, User sender) {
		for (User user : users) {
			if (user != sender) {
				user.receive(message);
			}
		}
	}
	
}
