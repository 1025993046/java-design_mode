package 实验四.迭代器模式;

public class ConcreteCollection implements MyCollection {

    private Object[] obj = {"迭代器", "测试", "用例"};

    @Override
    public MyIterator createIterator() {
        return new ConcreteIterator(obj);
    }
}
