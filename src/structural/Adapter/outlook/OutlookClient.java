package structural.Adapter.outlook;

// external library

public class OutlookClient {
	public void initialize() {
		System.out.println("connecting to outlook server...");
	}
	
	public void sentMessage(String content) {
		System.out.println("content: " + content);
		System.out.println("email sent by outlook");
	}
}
