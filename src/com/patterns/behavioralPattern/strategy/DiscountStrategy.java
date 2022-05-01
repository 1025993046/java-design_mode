package com.patterns.behavioralPattern.strategy;

public interface DiscountStrategy {
	double calculatePrice(double price, int count); 
}
