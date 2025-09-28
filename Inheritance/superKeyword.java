

class Animal {
    String name = "Animal";

    void sound() {
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal {
    String name = "Dog";

    void sound() {
        super.sound(); 
        System.out.println("Dog barks");
    }

    void showNames() {
        System.out.println("Child class name: " + name);
        System.out.println("Parent class name using super: " + super.name);
    }
}

public class superKeyword {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.sound();
        d.showNames();
    }
}

    

