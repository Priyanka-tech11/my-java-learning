class Vehicle {
    void run() {
        System.out.println("Vehicle is running");
    }
}

class Bike extends Vehicle {
   
    void run() {
        System.out.println("Bike is running fast");
    }
}

public class Dynamic {
    public static void main(String[] args) {
        Vehicle v;       // Parent reference

        v = new Vehicle();  // Parent object
        v.run();            // Vehicle's method

        v = new Bike();     // Child object
        v.run();            // Bike's overridden method
    }
}
