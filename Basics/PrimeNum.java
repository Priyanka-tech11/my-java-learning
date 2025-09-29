class PrimeNum {
    public static void main(String[] args) {
        int n = 100;
        int count = 0;
        int num = 2;
        long sum = 0;
        while (count < n) {
            if (isPrime(num)) {
                sum += num;
                count++;
            }
            num++;
        }

        System.out.println("Sum of first " + n + " prime numbers = " + sum);
    }

    public static boolean isPrime(int num) {
        if (num <= 1)
            return false;
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0)
                return false;
        }
        return true;
    }
}
