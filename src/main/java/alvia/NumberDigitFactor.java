package alvia;

import java.util.Scanner;

public class NumberDigitFactor {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a number");
        int n;
        n = in.nextInt();
        while (n > 0) {
            int r = n % 10;
            for (int i = 1; i <= r; i++) {
                if (r % i == 0)
                    System.out.print(i + " ,");
            }
            System.out.println();
            n = n / 10;
        }
    }
}
