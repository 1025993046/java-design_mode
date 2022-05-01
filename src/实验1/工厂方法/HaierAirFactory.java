package 实验1.工厂方法;

import com.patterns.creationalPattern.factoryMethod.Air;
import com.patterns.creationalPattern.factoryMethod.AirFactory;

public class HaierAirFactory implements AirFactory {
    @Override
    public Air produceAir() {
        return new HaierAir();
    }
}
