package structural.Adapter;

import structural.Adapter.adaptors.GmailAdaptor;
import structural.Adapter.adaptors.OutlookAdaptor;
import structural.Adapter.adaptors.SmtpAdaptor;

public class App {
	public static void main(String[] args) {
		EmailClient gmail = new EmailClient(new Email("Hi there"));
		gmail.sent(new GmailAdaptor()); // send message by gmail
		
		EmailClient outlook = new EmailClient(new Email("Hello world!"));
		outlook.sent(new OutlookAdaptor()); // send message by outlook
		
		EmailClient smtp = new EmailClient(new Email("Morning!"));
		smtp.sent(new SmtpAdaptor()); // send message by smtp
	}
}
