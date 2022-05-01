package com.patterns.behavioralPattern.strategy;

public class StrategyTest {
	public static void main(String[] args) {
		DiscountStrategy computerBookStrategy = new ComputerBookStrategy();
		DiscountStrategy novelBookStrategy = new NovelBookStrategy();
		DiscountStrategy languageBookStrategy = new LanguageBookStrategy();
		
		BookPrice bp = new BookPrice();
		bp.setDiscountStrategy(computerBookStrategy);
		bp.calculatePrice(98, 10);
		
		bp.setDiscountStrategy(novelBookStrategy);
		bp.calculatePrice(98, 10);
		
		bp.setDiscountStrategy(languageBookStrategy);
		bp.calculatePrice(98, 10);
	}
}
