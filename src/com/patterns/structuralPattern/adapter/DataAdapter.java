package com.patterns.structuralPattern.adapter;

public class DataAdapter implements DataOperation{

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
