package structural.Adapter;

/*
 * Adapter design pattern is one of the structural design pattern and its used so that two unrelated
 * interfaces can work together. The object that joins these unrelated interface is called an Adapter.
 * 
 * Example:
 * 
 * 			 GmailAdaptor	---->	GmailClient | external library
 * 			/
 * 		   /
 * client  ---- SmtpAdaptor	----> 	SmtpClient | external library
 * 		   \
 * 			\
 * 			 OutlookAdaptor	---->	OutlookClient | external library
 * 
 * link to the article:
 * https://www.digitalocean.com/community/tutorials/adapter-design-pattern-java
 */

public interface EmailProvider {
	public void sent(Email email); // use methods in external libraries here
}
