package com.patterns.creationalPattern.simpleFactory;

public class SimpleFactoryTest {
    public static void main(String[] args) {
        Person robot =  Nvwa.getPerson('R');
        robot.disc();
    }
}
