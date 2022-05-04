package 实验四.迭代器模式;

public class IteratorTest {

    public static void main(String[] args) {
        ConcreteCollection collection = new ConcreteCollection();
        MyIterator iterator = collection.createIterator();

        System.out.println(">正序遍历：");
        while (iterator.hasNext()) {
            iterator.next();
            System.out.println(iterator.getCurrentItem());
        }
        System.out.println("----------------------------");
        System.out.println(">逆序遍历：\n" + iterator.getCurrentItem());
        while (iterator.hasPrevious()) {
            iterator.previous();
            System.out.println(iterator.getCurrentItem());
        }
    }
}
