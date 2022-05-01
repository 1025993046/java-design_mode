package com.patterns.creationalPattern.abstractFactory;

public class MacFactory implements ComputerPartsFactory {
    @Override
    public CPU produceCPU() {
        return new MacCPU();
    }

    @Override
    public RAM produceRAM() {
        return new MacRAM();
    }
}