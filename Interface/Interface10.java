import java.util.Arrays;
import java.util.Collections;

interface Sortable {
    void sort(Integer[] arr);
}

class QuickSort implements Sortable {
    public void sort(Integer[] arr) {
        Arrays.sort(arr, Collections.reverseOrder());
        System.out.println("QuickSort Descending: " + Arrays.toString(arr));
    }
}

class MergeSort implements Sortable {
    public void sort(Integer[] arr) {
        Arrays.sort(arr, Collections.reverseOrder());
        System.out.println("MergeSort Descending: " + Arrays.toString(arr));
    }
}

public class SortDemo {
    public static void main(String[] args) {
        Integer[] arr1 = {5, 2, 9, 1, 6};
        Integer[] arr2 = {7, 3, 8, 4, 2};

        Sortable q = new QuickSort();
        q.sort(arr1);

        Sortable m = new MergeSort();
        m.sort(arr2);
    }
}
