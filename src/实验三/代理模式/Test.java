package 实验三.代理模式;

/**
 * @author GuoZeWei
 * @date 2022/5/2  19:37
 */
public class Test {
    public static void main(String[] args) {
        Subject proxy=new Picture();
        proxy.run();
    }
}
