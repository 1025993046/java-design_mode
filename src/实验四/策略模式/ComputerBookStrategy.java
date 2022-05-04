package 实验四.策略模式;

public class ComputerBookStrategy  implements DiscountStrategy {

	@Override
	public double calculatePrice(double price, int count) {
		System.out.println( "单价为 " + price + " 的 " + count + "本 计算机类图书 打折后的总价格为：" + price * count * 0.9);
		return price * count * 0.9;
	}

}
