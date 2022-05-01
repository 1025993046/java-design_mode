package 实验1.简单工厂;

public class SimpleFactoryTest {
    public static void main(String[] args) {
        Person robot =  Nvwa.getPerson('R');
        robot.disc();
    }
}
