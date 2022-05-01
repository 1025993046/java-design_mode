package com.patterns.creationalPattern.abstractFactory;

public class PcFactory implements ComputerPartsFactory {
    @Override
    public CPU produceCPU() {
        return new PcCPU();
    }

    @Override
    public RAM produceRAM() {
        return new PcRAM();
    }
}
