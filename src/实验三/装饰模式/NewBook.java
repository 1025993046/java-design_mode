package 实验三.装饰模式;

public class NewBook extends BookDecorator {

	public NewBook(Book book) {
		super(book);
	}

	public void freeze() {
		System.out.println("书本冻结了！");
	}
	
	public void lose() {
		System.out.println("书本丢失了！");
	}
	
}
