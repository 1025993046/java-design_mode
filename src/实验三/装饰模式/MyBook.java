package 实验三.装饰模式;

public class MyBook implements Book {
	@Override
	public void borrowBook() {
		System.out.println("借到了一本书！");
	}
}
