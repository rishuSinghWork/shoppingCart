package com.shopping.models;

public class CartItem {
	private final Product product;
	private int quantity;
	
	public CartItem(Product product, int quantity) {
		this.product = product;
		this.quantity = quantity;
	}
	
	public Product getProduct() {
		return product;
	}
	
	public int getQuantity() {
		return quantity;
	}
	
	public void setQuantuty(int quantity) {
		this.quantity = quantity;
	}
	
	public double getTotalPrice() {
		return product.getPrice() * quantity;
	}
	
	@Override
	public String toString() {
		return "CartItem{" +
				"product=" + product +
				", quantity=" + quantity +
				", totalPrice=" + getTotalPrice() +
				'}';
	}
}
