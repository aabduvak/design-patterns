package structural.Proxy;

/**
 * Proxy design pattern intent according to GoF is: 
 * Provide a surrogate or placeholder for another object to control access to it. The definition
 * itself is very clear and proxy design pattern is used when we want to provide controlled access 
 * of a functionality. Let’s say we have a class that can run some command on the system. Now if 
 * we are using it, its fine but if we want to give this program to a client application, it can 
 * have severe issues because client program can issue command to delete some system files or 
 * change some settings that you don’t want.
 */

public class ExecProxy implements ICmdExecutor{
	private boolean isAdmin = false;
	private CmdExecutor executor;
	
	public ExecProxy(String user) {
		if (user.equals("aabduvak"))
			isAdmin = true;
		this.executor = new CmdExecutor();
	}

	@Override
	public void runCommand(String cmd) throws Exception {
		if(isAdmin){
			executor.runCommand(cmd);
		}else{
			if(cmd.trim().startsWith("rm")){
				throw new Exception("rm command is not allowed for non-admin users.");
			}else{
				executor.runCommand(cmd);
			}
		}
	}
	
}
