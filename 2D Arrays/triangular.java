import java.util.Scanner;
class triangular{
    public static void main (String [] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number of rows");
        int rows=sc.nextInt();
        System.out.println("Enter number of cols");
        int cols=sc.nextInt();
        int matrix[][]= new int [rows][cols];

        for (int i=0;i<rows;i++){
            for(int j=0;j<cols;i++)
            {
                matrix[i][j]=sc.nextInt();
            }
        }
         System.out.println("Lower Triangular Matrix:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (i >= j) { // elements on or below diagonal
                    System.out.print(matrix[i][j] + " ");
                } else {
                    System.out.print("0 "); // elements above diagonal
                }
            }
    }
}
}