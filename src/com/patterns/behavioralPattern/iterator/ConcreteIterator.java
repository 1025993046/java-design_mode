package com.patterns.behavioralPattern.iterator;

public class ConcreteIterator implements MyIterator {

    private Object[] obj = null;
    private int currentIndex = -1;

    public ConcreteIterator(Object[] obj) {
        this.obj = obj;
    }

    @Override
    public boolean hasNext() {
        if (currentIndex < obj.length - 1)
            return true;
        return false;
    }

    @Override
    public boolean hasPrevious() {
        if (currentIndex > 0)
            return true;
        return false;
    }

    @Override
    public void next() {
        if(currentIndex < obj.length - 1)
            currentIndex++;
    }

    @Override
    public void previous() {
        if (currentIndex > 0)
            currentIndex--;
    }

    @Override
    public Object getCurrentItem() {
        return obj[currentIndex];
    }
}
