package ilentt.ilenlab.com.strategypattern;

public class CreditCard implements PaymentMethod {
	private String name;
	private String cardNumber;
	private String vcc;
	private String dateExpire;
	
	public CreditCard() {
		this.name = "";
		this.cardNumber = "";
		this.vcc = "";
		this.dateExpire = "";
	}
	
	public CreditCard(String name, String cardNumber, String vcc, String dateExpire) {
		this.name = name;
		this.cardNumber = cardNumber;
		this.vcc = vcc;
		this.dateExpire = dateExpire;
	}
	
	public String toString() {
		return "Creadit card information:\nName:" + name +
				"\nCard Number: " + cardNumber +
				"\nVCC: " + vcc +
				"\nDate Expire: " + dateExpire;
	}
	public void Pay(double amount) {
		System.out.println("Total: " + amount + " paid with creadit/debit card.");
	}
	
}
