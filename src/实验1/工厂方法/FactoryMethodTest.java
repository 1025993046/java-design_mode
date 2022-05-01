package 实验1.工厂方法;

import com.patterns.creationalPattern.factoryMethod.Air;
import com.patterns.creationalPattern.factoryMethod.AirFactory;

public class FactoryMethodTest {
    public static void main(String[] args) {
        com.patterns.creationalPattern.factoryMethod.AirFactory airFactory = (AirFactory) ReadXML.getObject();
        Air air = airFactory.produceAir();
        air.work();
    }
}