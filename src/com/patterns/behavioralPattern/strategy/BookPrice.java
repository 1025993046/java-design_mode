package com.patterns.behavioralPattern.strategy;

public class BookPrice {
	private DiscountStrategy discountStrategy;

	public DiscountStrategy getDiscountStrategy() {
		return discountStrategy;
	}

	public void setDiscountStrategy(DiscountStrategy discountStrategy) {
		this.discountStrategy = discountStrategy;
	}
	
	public double calculatePrice(double price, int count) {
		return discountStrategy.calculatePrice(price, count);
	}

}
