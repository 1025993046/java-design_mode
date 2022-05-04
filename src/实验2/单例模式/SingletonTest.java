package 实验2.单例模式;


/**
 * @author GuoZeWei
 * @date 2022/5/2  15:28
 */
public class SingletonTest {
    public static void main(String[] args) {
        LoginForm loginForm = LoginForm.getInstance();
        loginForm = LoginForm.getInstance();
        loginForm = LoginForm.getInstance();
    }
}
