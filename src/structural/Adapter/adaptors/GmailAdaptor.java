package structural.Adapter.adaptors;

import structural.Adapter.Email;
import structural.Adapter.EmailProvider;
import structural.Adapter.gmail.GmailClient;

public class GmailAdaptor implements EmailProvider{
	private GmailClient gmailClient = new GmailClient();

	@Override
	public void sent(Email email) {
		gmailClient.connect();
		gmailClient.sentEmail(email.getContent());
	}
}
