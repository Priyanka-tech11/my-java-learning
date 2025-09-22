public class duplicate {
    public static void main(String [] arg)
    {
        int [] arr={1,2,3,2,2,3};

        for ( int i=0; i<arr.length;i++)
        {
            
            boolean existAlready=false;

            for (int j=0;j<i;j++)
            { if (arr[i] == arr[j]){
                existAlready=true;
                break;
            }
        }
            if(!existAlready)
            {
                 int count = 0;
                for (int k = 0; k < arr.length; k++) {
                    if (arr[i] == arr[k]) {
                        count++;
            }
        }
        if (count > 1) {
                    System.out.print(arr[i] + " ");
                }
    }
}
        }
}
