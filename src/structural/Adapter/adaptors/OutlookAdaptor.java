package structural.Adapter.adaptors;

import structural.Adapter.Email;
import structural.Adapter.EmailProvider;
import structural.Adapter.outlook.OutlookClient;

public class OutlookAdaptor implements EmailProvider{
	private OutlookClient outlookClient = new OutlookClient();

	@Override
	public void sent(Email email) {
		outlookClient.initialize();
		outlookClient.sentMessage(email.getContent());		
	}
}
