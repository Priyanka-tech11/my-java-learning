public class smallest {
    public static void main (String [] args)
    {
        int arr[]={12,14,15,13,16,1,2,11};
        int min=arr[0];
        for (int i=1; i<arr.length;i++)
        {  if (arr[i]<min)
            {   
                min=arr[i];
                         }
                        }     
   System.out.println("Largest element is:" + min);

        
    }
    
}