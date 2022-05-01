package com.patterns.creationalPattern.factoryMethod;

public class FactoryMethodTest {
    public static void main(String[] args) {
        AirFactory airFactory = (AirFactory) ReadXML.getObject();
        Air air = airFactory.produceAir();
        air.work();
    }
}