package com.patterns.creationalPattern.abstractFactory;

public class AbstractFactoryTest {
    public static void main(String[] args) {
        try {
            ComputerPartsFactory factory = (ComputerPartsFactory) ReadXML.getObject();
            CPU cpu = factory.produceCPU();
            RAM ram = factory.produceRAM();
            cpu.work();
            ram .work();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}