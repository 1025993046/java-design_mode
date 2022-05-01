package com.patterns.creationalPattern.factoryMethod;

public class MideaAirFactory implements AirFactory {
    @Override
    public Air produceAir() {
        return new MideaAir();
    }
}
