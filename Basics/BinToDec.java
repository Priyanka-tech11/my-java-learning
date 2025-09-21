class Main {
    public static void main(String[] args) {
        int binary = 1011;  // binary number
        int decimal = 0, base = 1, rem;

        while (binary > 0) {
            rem = binary % 10;        // get last digit
            decimal += rem * base;    // add to decimal
            base = base * 2;          // increase power of 2
            binary = binary / 10;     // remove last digit
        }

        System.out.println("Decimal value = " + decimal);
    }
}
