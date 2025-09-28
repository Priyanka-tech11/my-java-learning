import java.util.Scanner;

class Shape {
    double radius;

    void getPerimeter() {
        System.out.println("Find perimeter of any shape");
    }

    void getArea() {
        System.out.println("Find area of any shape");
    }
}

class Circle extends Shape {
  
    void getArea() {
        double area = Math.PI * radius * radius;
        System.out.println("Area of Circle: " + area);
    }

   
    void getPerimeter() {
        double perimeter = 2 * Math.PI * radius;
        System.out.println("Perimeter of Circle: " + perimeter);
    }
}

class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Enter radius of circle: ");
        double r = s.nextDouble();

        Circle c = new Circle();
        c.radius = r;   
        c.getArea();
        c.getPerimeter();

            }
}

