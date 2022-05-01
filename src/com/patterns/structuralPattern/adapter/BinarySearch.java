package com.patterns.structuralPattern.adapter;

public class BinarySearch {

    public int binarySearch(int[] array, int target) {

        int low = 0, high = array.length - 1;
        while (low <= high) {
            int mid = (low + high) >>> 1;

            if (target > array[mid])
                low = mid + 1;
            else if (target < array[mid])
                high = mid - 1;
            else
                return mid;
        }
        return -1;
    }
}
