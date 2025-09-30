public class SwapArray {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50};

     
        int[] newArr = arr.clone();

      
        int temp = newArr[0];
        newArr[0] = newArr[newArr.length - 1];
        newArr[newArr.length - 1] = temp;

       
        System.out.print("Original Array: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }

        System.out.println();

        System.out.print("New Array (after swapping): ");
        for (int num : newArr) {
            System.out.print(num + " ");
        }
    }
}
