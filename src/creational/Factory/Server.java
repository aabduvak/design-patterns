package creational.Factory;

public class Server extends Computer{
	private String RAM;
	private String SSD;
	private String CPU;
	
	public Server(String ram, String ssd, String cpu) {
		this.RAM = ram;
		this.SSD = ssd;
		this.CPU = cpu;
	}
	
	@Override
	public String getRAM() {
		return (this.RAM);
	}
	
	@Override
	public String getCPU() {
		return (this.CPU);
	}
	
	@Override
	public String getSSD() {
		return (this.SSD);
	}
}
