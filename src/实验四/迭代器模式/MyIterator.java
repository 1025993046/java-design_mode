package 实验四.迭代器模式;

public interface MyIterator {

    boolean hasNext();

    boolean hasPrevious();

    void next();

    void previous();

    Object getCurrentItem();
}
