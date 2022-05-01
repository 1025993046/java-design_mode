package 实验1.工厂方法;

import com.patterns.creationalPattern.factoryMethod.Air;

public class HaierAir implements Air {
    @Override
    public void work() {
        System.out.println("海尔空调");
    }
}
