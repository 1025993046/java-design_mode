package 实验2.适配器模式;

public class QuickSort {

    public void quickSort(int[] array) {
        if (array == null || array.length < 2) {
            return;
        }
        doQuickSort(array, 0, array.length - 1);
    }

    private void doQuickSort(int[] arr, int left, int right) {
        int l = left;
        int r = right;
        int pivot = arr[(left + right) >>> 1];

        while (l < r) {
            while (arr[l] < pivot) {
                l++;
            }
            while (arr[r] > pivot) {
                r--;
            }
            if (l >= r) {
                break;
            }

            int temp = arr[r];
            arr[r] = arr[l];
            arr[l] = temp;

            if (arr[l] == pivot) {
                r--;
            }
            if (arr[r] == pivot) {
                l++;
            }

        }
        if (l == r) {
            l++;
            r--;
        }

        if (left < r) {
            doQuickSort(arr, left, r);
        }
        if (l < right) {
            doQuickSort(arr, l, right);
        }
    }

}
