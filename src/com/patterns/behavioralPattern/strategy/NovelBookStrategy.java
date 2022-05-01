package com.patterns.behavioralPattern.strategy;

public class NovelBookStrategy implements DiscountStrategy{

	@Override
	public double calculatePrice(double price, int count) {
		double totalPrice = price * count;
		if(totalPrice >= 100)
			totalPrice -= new Double(totalPrice).intValue() / 100 * 10;
		System.out.println( "单价为 " + price + " 的 " + count + "本 小说类图书 打折后的总价格为：" + totalPrice);
		return totalPrice;
	}

}
