public class SecondLargest {
    public static void main( String [] args)
{
    int arr[]={12,45,78,23,56,89};
    for (int i=0;i<arr.length;i++){
        for (int j=1;j<arr.length-i-1;j++)
        {
            if(arr[j]>arr[j+1])
            {
                int temp=arr[j];
                arr[j]=arr[j+1];
                arr[j+1]=temp;
            }
        }
    }

    System.out.println("\n2nd largest element of an array:"+ arr[arr.length-2]);
}    
}  

