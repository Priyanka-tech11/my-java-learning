

class Printer {
    void print() {
        System.out.println("Printing a document...");
    }
}

class LaserPrinter extends Printer {
    @Override
    void print() {
        System.out.println("Printing a document using Laser Printer...");
    }
}

public class overridding {
    public static void main(String[] args) {
        Printer p1 = new Printer();
        p1.print(); 

        LaserPrinter p2 = new LaserPrinter();
        p2.print();  

     
    }
}

