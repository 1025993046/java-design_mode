package com.patterns.creationalPattern.factoryMethod;

public class HaierAirFactory implements AirFactory {
    @Override
    public Air produceAir() {
        return new HaierAir();
    }
}
