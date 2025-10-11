interface Animal{
    void bark();
}
class Dog implements Animal{
    public void bark(){
        System.out.println("Dog is barking");
    }
}
class Interface2{
    public static void main(String [] args)
    {
        Dog obj=new Dog();
            obj.bark();
        
    }
}