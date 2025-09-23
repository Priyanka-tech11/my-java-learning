public class Reverse {
    public static void main(String [] args)
    {   int [] arr={10,20,30,40,50,60};
       
              System.out.println("original array");
        for (int i=0;i<arr.length;i++)
        {
            System.out.print( " " +arr[i]);
        }
            System.out.println("\nReverse array");
            for (int k=arr.length-1;k>=0;k--)
            {
                 System.out.print( " " +arr[k]);
            }
    }
}    

