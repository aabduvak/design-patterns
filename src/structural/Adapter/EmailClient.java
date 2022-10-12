package structural.Adapter;

public class EmailClient {
	private Email email;

	public EmailClient(Email email) {
		this.email = email;
	}
	
	public void sent(EmailProvider emailProvider) {
		emailProvider.sent(email); // using same method for all providers
	}
}
