package something;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n;
        System.out.println("Enter a number");
        n = in.nextInt();
        int c = 0;
        for (int i = 1; i <= n; i++)
        {
            if (n % i == 0)
            {
                c++;
            }
        }
        if (c == 2)
            System.out.println("Prime");
        else
            System.out.println("Not prime");

    }
}
