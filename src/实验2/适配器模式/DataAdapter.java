package 实验2.适配器模式;

public class DataAdapter implements DataOperation {

    private QuickSort quickSort;
    private BinarySearch binarySearch;

    public DataAdapter() {
        quickSort = new QuickSort();
        binarySearch = new BinarySearch();
    }

    @Override
    public void sort(int[] array) {
        quickSort.quickSort(array);
    }

    @Override
    public int search(int[] array, int target) {
        return binarySearch.binarySearch(array, target);
    }
}
