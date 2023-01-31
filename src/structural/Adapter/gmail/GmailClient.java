package structural.Adapter.gmail;

// External Library

public class GmailClient {
	public void connect() {
		System.out.println("connection to gmail server...");
	}
	
	public void sentEmail(String content) {
		System.out.println("content: " + content);
		System.out.println("email sent by gmail");
	}
}
