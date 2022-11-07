package factory;

public abstract class Computer {
 	public abstract String getRAM();
	public abstract String getSSD();
	public abstract String getCPU();
	
	@Override
	public String toString() {
		return "RAM= "+this.getRAM()+", HDD="+this.getSSD()+", CPU="+this.getCPU();
	}
}
