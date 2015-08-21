package ilentt.ilenlab.com.strategypattern;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {
	public List<Products> lstProduct;
	public ShoppingCart() {
		this.lstProduct = new ArrayList<Products>();
	}
	
	public void addProduct(Products product) {
		lstProduct.add(product);
	}
	
	public void removeProduct(Products product) {
		lstProduct.remove(product);
	}
	
	public void emptyShoppingCard() {
		lstProduct.clear();
	}
	
	public double CalculateTotal() {
		double sum = 0;
		for(Products p : lstProduct)
			sum+= p.getPrice();
		return sum;
	}
	
	public void PayBy(PaymentMethod payment) {
		double amount = CalculateTotal();
		payment.Pay(amount);
	}
}
