package 实验三.装饰模式;

public class BookDecorator implements Book {
	private Book book;
	public BookDecorator(Book book) {
		this.book = book;
	}
	@Override
	public void borrowBook() {
		book.borrowBook();
	}
}
