 class Shape {
    int getArea()
    {
        System.out.println("You can find area of any shape with this function");
        return 0;
    }
}
    class Rectangle extends Shape{
        int length;
        int breadth;
        Rectangle(int x,int y)
        {
            length=x;
            breadth=y;
        }
        int getArea()
        {
            return length*breadth;
        }
            }
class Main{
    public static void main(String [] args)
    {
        Shape s=new Shape();
        Rectangle R=new Rectangle(4, 5);
        s.getArea();
         System.out.println("Area of rectangle: " + R.getArea());
       
    }
}
    

