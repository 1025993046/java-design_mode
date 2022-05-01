package com.patterns.structuralPattern.composite;

public class ImageFile extends AbstractFile {
    @Override
    protected void killVirus() {
        System.out.println("图片文件-开始杀毒...");
    }
}
