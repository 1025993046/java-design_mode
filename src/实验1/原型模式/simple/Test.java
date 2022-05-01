package 实验1.原型模式.simple;

/**
 * @author GuoZeWei
 * @date 2022/4/17  20:35
 */

public class Test {
	public static void main(String[] args) {
		Address address=new Address("SC","CD","WHQ");
		Customer c1=new Customer("sqq", address);
		Customer c2=c1.clone();
		c2.getAddress().setCity("MY");
		System.out.println("c1"+c1.toString());
		System.out.println("c2"+c2.toString());
	}
}
