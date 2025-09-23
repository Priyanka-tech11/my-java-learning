public class largest {
    public static void main (String [] args)
    {
        int arr[]={12,14,15,13,16,1,2,11};
        int max=arr[0];
        for (int i=1; i<arr.length;i++)
        {  if (arr[i]>max)
            {   
                max=arr[i];
                         }
                        }     
   System.out.println("Largest element is:" + max);

        
    }
    
}
