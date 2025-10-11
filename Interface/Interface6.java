interface Drawable {
    void draw();
}

class Circle implements Drawable {
    public void draw() {
        System.out.println("Drawing a Circle");
    }
}

class Rectangle implements Drawable {
    public void draw() {
        System.out.println("Drawing a Rectangle");
    }
}

class Triangle implements Drawable {
    public void draw() {
        System.out.println("Drawing a Triangle");
    }
}

public class DrawableDemo {
    public static void main(String[] args) {
        Drawable d1 = new Circle();
        Drawable d2 = new Rectangle();
        Drawable d3 = new Triangle();

        d1.draw();
        d2.draw();
        d3.draw();
    }
}
