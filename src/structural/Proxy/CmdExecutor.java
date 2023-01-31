package structural.Proxy;

import java.io.IOException;

public class CmdExecutor implements ICmdExecutor{

	@Override
	public void runCommand(String cmd) throws IOException {
		Runtime.getRuntime().exec(cmd);
		System.out.println("command: {" + cmd + "} executed");
	}	
}