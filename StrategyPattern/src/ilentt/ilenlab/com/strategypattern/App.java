package ilentt.ilenlab.com.strategypattern;

public class App {
	
	public ShoppingCart cart;
	public Products p1,p2;
	public CreditCard card;
	public Cash cash;
	
	public App() {
		this.cart = new ShoppingCart();
		this.p1 = new Products("Bread", 120);
		this.p2 = new Products("Meat",450);
	}
	
	public void runApp() {
		cart.addProduct(p1);
		cart.addProduct(p2);
		this.card = new CreditCard("Tran Thanh I Len","0001","AAA","31/12/2020");
		this.cash = new Cash("Tran Thanh I Len", "Binh Thanh, HCM");
		
		if(cart.CalculateTotal()>500) {
			cart.PayBy(card);
			System.out.println(card.toString());
		}
		else {
			cart.PayBy(cash);
			System.out.println(cash.toString());
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		App a = new App();
		a.runApp();
	}

}
