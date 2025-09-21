import java.util.Scanner;
 class Average {
    int a,b,c,d,e;
    double avg;
    void calculate()
    {
avg=(a+b+c+d+e)/5.0;
System.out.println("average of five numbers are:"+ avg);
    }
    
}
class inputaverage{
    public static void main(String [] args)
    {
        Scanner obj=new Scanner (System.in);
        Average A=new Average();
        System.out.println("Enter 1st number:");
        A.a=obj.nextInt();
         System.out.println("Enter 2nd number:");
           A.b=obj.nextInt();
            System.out.println("Enter 3rd number:");
              A.c=obj.nextInt();
               System.out.println("Enter 4th number:");
                 A.d=obj.nextInt();
                  System.out.println("Enter 5th number:");
                    A.e=obj.nextInt();
                    A.calculate();
        
        
    }
}
