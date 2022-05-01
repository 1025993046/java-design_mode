package com.patterns.behavioralPattern.iterator;

public interface MyIterator {

    boolean hasNext();

    boolean hasPrevious();

    void next();

    void previous();

    Object getCurrentItem();
}
