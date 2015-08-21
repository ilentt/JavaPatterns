package ilentt.ilenlab.com.strategypattern;

public class Cash implements PaymentMethod {
	private String name;
	private String address;
	
	public Cash() {
		this.name = "";
		this.address = "";
	}

	public Cash(String name, String address) {
		this.name = name;
		this.address = address;
	}
	
	public String toString() {
		return "Person information:\nName: "+name+"\nAddress: " + address;
	}
	
	public void Pay(double amount) {
		System.out.println("Total: " + amount + " paid with cash.");
	}
}
