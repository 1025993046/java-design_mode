package 实验四.策略模式;

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
