package ilentt.ilenlab.com.factorypattern;

public class FactotyComputer {
	public FactotyComputer() {
		// constructor
	}
	
	public Computer getComputer(String type, String ram, String cpu, String hdd) {
		if("PC".equalsIgnoreCase(type)) 
			return new PC(ram, cpu, hdd);
		if("Server".equalsIgnoreCase(type))
			return new Server(ram, cpu, hdd);
		return null;
	}
}
