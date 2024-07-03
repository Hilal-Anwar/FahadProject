package zoya;

public class PrimeNumber {
    public static void main(String[] args) {
        int n = 10; // Number of prime numbers to find
        int[] primes = new int[n];
        int count = 0; // Count of prime numbers found
        int num = 2; // Start checking from 2

        while (count < n) {
            boolean isPrime = true;

            for (int i = 2; i <= Math.sqrt(num); i++) {
                if (num % i == 0) {
                    isPrime = false;
                    break;
                }
            }

            if (isPrime) {
                primes[count] = num;
                count++;
            }

            num++;
        }

        // Print the prime numbers
        System.out.println("First " + n + " prime numbers:");
        for (int prime : primes) {
            System.out.print(prime + " ");
        }
    }
}
