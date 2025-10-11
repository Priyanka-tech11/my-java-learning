interface Resizable {
    void resizeWidth(int width);
    void resizeHeight(int height);
}

class Rectangle implements Resizable {
    int width;
    int height;

    Rectangle(int w, int h) {
        width = w;
        height = h;
    }

    public void resizeWidth(int w) {
        width = w;
    }

    public void resizeHeight(int h) {
        height = h;
    }

    void display() {
        System.out.println("Width: " + width + ", Height: " + height);
    }
}

public class Interface5 {
    public static void main(String[] args) {
        Rectangle r = new Rectangle(10, 5);
        r.display();

        r.resizeWidth(15);
        r.resizeHeight(8);
        r.display();
    }
}

