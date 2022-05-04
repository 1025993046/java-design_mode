package 实验三.外观模式;

public class FacadeTest {
	public static void main(String[] args) {
		Mainframe mainframe = new Mainframe();
		mainframe.on();
		
		System.out.println("----------------------");
		
		mainframe.off();
	}
}
