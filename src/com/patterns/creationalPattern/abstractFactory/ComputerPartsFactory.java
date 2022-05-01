package com.patterns.creationalPattern.abstractFactory;

public interface ComputerPartsFactory {
    CPU produceCPU();
    RAM produceRAM();
}
