class z
{
int x=8;
int y=2;
 void sum()
{
int S=(x+y);
System.out.println("Sum of two numbers are " +S);
}

 void sub()
{
int S=(x-y);
System.out.println("Sub of two numbers are " +S);
}


 void mul()
{
int S=(x*y);
System.out.println("Mul of two numbers are " +S);
}


 void divide()
{
int S=(x/y);
System.out.println("Rem of two numbers are " +S);
}

}
class Cal{
public static void main(String []args)
{
z obj=new z();
obj.sum();
obj.sub();
obj.mul();
obj.divide();
}
}
