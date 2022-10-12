package structural.Adapter.adaptors;

import structural.Adapter.Email;
import structural.Adapter.EmailProvider;
import structural.Adapter.smtp.SmtpClient;

public class SmtpAdaptor implements EmailProvider{
	private SmtpClient smtpClient = new SmtpClient();
	
	@Override
	public void sent(Email email) {
		smtpClient.init();
		smtpClient.sentData(email.getContent());
	}
}
