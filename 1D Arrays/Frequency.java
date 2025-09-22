public class Frequency {
    public static void main(String [] args)
    { 
    int []arr={1,2,1,5,5,4,4};
    
        for (int i=0;i<arr.length;i++)
        {
            int count=0;
            boolean countedAlready=false;
    
            for (int k=0;k<i;k++)
            {
                if (arr[i]==arr[k])
                {
                    countedAlready=true;
                    break;
                }
            }
            if (!countedAlready){
                for (int j=0;j<arr.length;j++)
                {
                    if (arr[i]==arr[j])
                    {
                        count++;
                    }
                }
                System.out.println(arr[i] + " appears " + count + " times");
            }
            }    
        }
    }