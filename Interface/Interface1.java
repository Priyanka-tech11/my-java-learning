interface Shape {
    void  getArea();
   }

class Rectangle implements Shape {
    int length = 5;
    int breadth = 6;

   public  void getArea()
        { int area1=length*breadth;
System.out.println("Area of rectangle:"+ area1);
        }
}

class Circle implements Shape {
    float radius = 5;

   public void getArea() {
        double area2 = Math.PI * radius * radius;
        System.out.println("Area of circle is:" + area2);
    }
}

class Triangle implements Shape{
        float base=5;
        float height=6;
       public  void getArea(){
                double area3 = 0.5 * base * height;
System.out.println("Area of triangle:"  + area3);
    }}

class Interface1 {
    public static void main(String [] args)
        {
           
            Rectangle obj2=new Rectangle();
            Circle obj3=new Circle();
            Triangle obj4=new Triangle();
          
             obj2.getArea();
              obj3.getArea();
               obj4.getArea();

        }

}
