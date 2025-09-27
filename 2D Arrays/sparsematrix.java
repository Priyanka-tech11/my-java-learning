import java.util.Scanner;

public class sparsematrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of rows: ");
        int rows = sc.nextInt();
        System.out.print("Enter number of columns: ");
        int cols = sc.nextInt();

        int[][] matrix = new int[rows][cols];
        int zeroCount = 0, totalElements = rows * cols;

    
        System.out.println("Enter matrix elements:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = sc.nextInt();
                if (matrix[i][j] == 0) {
                    zeroCount++;
                }
            }
        }

   
        System.out.println("\nMatrix:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

  
        if (zeroCount > totalElements / 2) {
            System.out.println("\nThe given matrix is a Sparse Matrix.");
        } else {
            System.out.println("\nThe given matrix is NOT a Sparse Matrix.");
        }

          }
}
