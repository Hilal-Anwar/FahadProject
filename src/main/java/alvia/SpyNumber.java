package alvia;

import java.util.Scanner;

public class SpyNumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n;
        System.out.println("Enter a number");
        n = in.nextInt();
        int s = 0, p = 1;
        int r;
        while (n > 0) {
            r = n % 10;
            s = s + r;
            p = p * r;
            n = n / 10;
        }
        if (s == p)
            System.out.println("Spy Number");
        else System.out.println("Not Spy number");
    }
}
