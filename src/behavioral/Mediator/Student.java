package behavioral.Mediator;

public class Student extends User{

	public Student(String name, IServer server) {
		super(name, server);
	}

	@Override
	public void send(String msg){
		System.out.println(this.name+": Sending Message:"+msg);
		server.sendMessage(msg, this);
	}
	@Override
	public void receive(String msg) {
		System.out.println(this.name+": Received Message:"+msg);
	}
}
