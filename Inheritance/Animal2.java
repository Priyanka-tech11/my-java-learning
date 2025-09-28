class animal{
    void move()
    {
        System.out.println("Animals move");
    }
}
 class cheetah extends animal{
    void move()
    {
        System.out.println("Cheetah runs");
    }
 }
 class Main{
    public static void main(String [] args)
    {
        animal A=new animal();
        cheetah C= new cheetah();
        A.move();
        C.move();
    }
 }