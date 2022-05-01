package 实验1.工厂方法;

import com.patterns.creationalPattern.factoryMethod.Air;

public class MideaAir implements Air {
    @Override
    public void work() {
        System.out.println("美的空调");
    }
}
