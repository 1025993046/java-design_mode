package 实验三.装饰模式;

public class DecoratorTest {
	public static void main(String[] args) {
		Book book = new MyBook();
		NewBook newBook = new NewBook(book);
		newBook.borrowBook();
		newBook.freeze();
		newBook.lose();
	}
}
