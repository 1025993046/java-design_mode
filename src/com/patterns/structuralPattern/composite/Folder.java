package com.patterns.structuralPattern.composite;

import java.util.ArrayList;
import java.util.List;

public class Folder extends AbstractFile{

    List<AbstractFile> children = new ArrayList<>();

    public void add(AbstractFile file) {
        children.add(file);
    }

    public void remove(AbstractFile file) {
        children.remove(file);
    }

    public AbstractFile getChild(int i) {
        return children.get(i);
    }

    @Override
    public void killVirus() {
        for (AbstractFile child : children)
            child.killVirus();
    }

}
