import java.util.Scanner;
class product{

    static int x,y;
   static  void display()
    {
        int pro=x*y;
 System.out.println("product of x and y :"+pro);

    }
}
class Main{
    public static void main(String [] args)
    {
        Scanner obj=new Scanner(System.in);
         System.out.println("Enter first number");
       product. x=obj.nextInt();
      
        System.out.println("Enter Second number");
        product.y=obj.nextInt();
       product.display();


    }
}