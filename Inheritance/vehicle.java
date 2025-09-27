class vehicle{
    void drive()
    {
        System.out.println("vehicle is being driven");
    }
}
class Car extends vehicle{
    void drive()
    {
        System.out.println("Repairing a car");
    }
}
class Main{
    public static void main(String [] args)
    {
        vehicle obj=new vehicle();
        Car obj1=new Car();
        obj.drive();
        obj1.drive();
    }
}