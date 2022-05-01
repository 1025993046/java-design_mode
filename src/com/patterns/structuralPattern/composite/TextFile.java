package com.patterns.structuralPattern.composite;

public class TextFile extends AbstractFile {
    @Override
    protected void killVirus() {
        System.out.println("文本文件-开始杀毒...");
    }
}
