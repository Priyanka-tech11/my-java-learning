class copy{
      public static void main(String args[])
      {     int i;
            int arr1[]={1,2,3,4,5};
            int arr2[]=new int[arr1.length];

            for( i=0;i<arr1.length;i++)
            {
                  arr2[i]=arr1[i];
            }
            for (int num:arr2)
            {
                  System.out.print( " " +num);
            }
      }
}
