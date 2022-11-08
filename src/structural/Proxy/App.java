package structural.Proxy;

public class App {
    public static void main(String[] args) throws Exception {
        ICmdExecutor executor = new ExecProxy("user");
		try {
			executor.runCommand("ls -l");
			executor.runCommand(" rm -f abc.pdf");
		} catch (Exception e) {
			System.out.println("Exception Message::"+e.getMessage());
		}
    }
}