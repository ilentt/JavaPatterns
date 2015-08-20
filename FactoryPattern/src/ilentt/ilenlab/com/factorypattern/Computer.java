package ilentt.ilenlab.com.factorypattern;

public abstract class Computer {
	public abstract String getRAM();
	public abstract String getCPU();
	public abstract String getHDD();
	
	public String toString() {
		return "RAM: " + this.getRAM() + ", CPU: " + this.getCPU() + 
				", HDD: " + this.getHDD();
	}
}
