package ilentt.ilenlab.com.factorypattern;

public class App {
	
	public Computer com1;
	public Computer com2;
	
	public App() {
		this.com1 = new FactotyComputer().getComputer("", "", "", "");
		this.com2 = new FactotyComputer().getComputer("", "", "", "");
	}
	
	public void runApp() {
		this.com1 = new FactotyComputer().getComputer("PC", "2GB", "2.4GHz", "500GB");
		this.com2 = new FactotyComputer().getComputer("Server", "32GB", "3GHz", "1TB");
		
		System.out.println("Factory PC config: "+com1);
		System.out.println("Factory Server config: "+com2);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		App a = new App();
		a.runApp();
	}

}
