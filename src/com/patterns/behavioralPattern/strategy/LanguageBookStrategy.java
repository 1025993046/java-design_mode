package com.patterns.behavioralPattern.strategy;

public class LanguageBookStrategy  implements DiscountStrategy{

	@Override
	public double calculatePrice(double price, int count) {
		System.out.println( "单价为 " + price + " 的 " + count  + "本 语言类图书 打折后的总价格为：" + (price * count - 2 * count));
		return (price - 2) * count;
	}

}
