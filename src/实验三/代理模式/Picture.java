package 实验三.代理模式;

/**
 * @author GuoZeWei
 * @date 2022/5/2  19:37
 */
public class Picture implements Subject {

	private Application app=new Application();

	@Override
	public void run() {
		System.out.println("点击快捷方式");
		app.run();
	}

}
