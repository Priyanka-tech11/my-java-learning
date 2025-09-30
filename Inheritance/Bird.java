abstract class Bird {
    abstract void fly();
    abstract void makeSound();
}

class Eagle extends Bird {
    void fly() {
        System.out.println("Eagle soars high in the sky.");
    }
    void makeSound() {
        System.out.println("Eagle makes a sharp screeching sound.");
    }
}

class Hawk extends Bird {
    void fly() {
        System.out.println("Hawk flies swiftly with great focus.");
    }
    void makeSound() {
        System.out.println("Hawk makes a loud piercing call.");
    }
}

class Main {
    public static void main(String[] args) {
        Bird eagle = new Eagle();
        Bird hawk = new Hawk();

        eagle.fly();
        eagle.makeSound();

        hawk.fly();
        hawk.makeSound();
    }
}
