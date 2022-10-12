package structural.Adapter.smtp;

// external

public class SmtpClient {
	public void init() {
		System.out.println("connecting...");
	}
	
	public void sentData(String content) {
		System.out.println("content: " + content);
		System.out.println("email sent by smtp");
	}
}
