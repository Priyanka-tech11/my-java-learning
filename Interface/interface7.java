interface Sortable {
    void sort(int[] arr);
}

class BubbleSort implements Sortable {
    public void sort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++)
            for (int j = 0; j < arr.length - i - 1; j++)
                if (arr[j] > arr[j + 1]) { int t = arr[j]; arr[j] = arr[j + 1]; arr[j + 1] = t; }
        System.out.println("Bubble Sort: " + java.util.Arrays.toString(arr));
    }
}

class SelectionSort implements Sortable {
    public void sort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            int min = i;
            for (int j = i + 1; j < arr.length; j++) if (arr[j] < arr[min]) min = j;
            int t = arr[i]; arr[i] = arr[min]; arr[min] = t;
        }
        System.out.println("Selection Sort: " + java.util.Arrays.toString(arr));
    }
}

public class Interface7 {
    public static void main(String[] args) {
        int[] arr1 = {5, 2, 9, 1, 6};
        int[] arr2 = {7, 3, 8, 4, 2};

        new BubbleSort().sort(arr1);
        new SelectionSort().sort(arr2);
    }
}
