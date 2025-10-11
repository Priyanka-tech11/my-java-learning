interface Flyable{
    void fly_obj();
}
class Airplane implements Flyable{
public void fly_obj()
{
    System.out.println("Airplane Flies in the air");
}
}
class Spacecraft implements Flyable{
public void fly_obj()
{
    System.out.println("Spacecraft Flies in the air");
}
}
class Helicopter implements Flyable{
public void fly_obj()
{
    System.out.println("Helicopter Flies in the air");
}
}
class Interface3{
    public static void main(String [] args)
    {
        Airplane a=new Airplane();
        Spacecraft s=new Spacecraft();
        Helicopter h=new Helicopter();
        a.fly_obj();
         s.fly_obj();
          h.fly_obj();
    }
}