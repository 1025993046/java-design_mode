package 实验2.适配器模式;

public class AdapterTest {
    public static void main(String[] args) {

        int[] a = {5, 8, 4, 1, 6};
        System.out.print("创建数组：");
        for (int i : a) {
            System.out.print(i + " ");
        }
        System.out.println();

        DataOperation dataOperation = new DataAdapter();
        dataOperation.sort(a);
        System.out.print("排序结果：");
        for (int i : a) {
            System.out.print(i + " ");
        }
        System.out.println();

        System.out.println("目标数5的索引：" + dataOperation.search(a, 5));
    }
}
