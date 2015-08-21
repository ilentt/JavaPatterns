package ilentt.ilenlab.com.strategypattern;

public class Products {
	private String name;
	private double price;
	
	public Products() {
		this.name = "";
		this.price = 0;
	}
	
	public Products(String name, double price) {
		this.name = name;
		this.price = price;
	}
	
	public String getName() {
		return this.name;
	}
	
	public double getPrice() {
		return this.price;
	}
}
