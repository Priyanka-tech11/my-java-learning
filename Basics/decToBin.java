
class dectobin{

   int num=258;
  void convert() {
        int n = num;
        String binary = ""; 

        while (n > 0) {
            int rem = n % 2;              // remainder
            binary = rem + binary;        // build binary string in reverse
            n = n / 2;                    // divide number by 2
            
        } 
       System.out.println("binary of 258 is :"+ binary);}
}
class Main{
        public static void main(String [] args)
    {
        dectobin obj=new dectobin();
        obj.convert();
     


    }
}