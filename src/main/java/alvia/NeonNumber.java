package alvia;

import java.util.Scanner;

public class NeonNumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n;
        System.out.println("Enter a number");
        n = in.nextInt();
        int sq = n * n;
        int s = 0, r;
        while (sq > 0) {
            r = sq % 10;
            s = s + r;
            sq = sq / 10;
        }
        if (s == n)
            System.out.println("Neon number");
        else System.out.println("Not a neon number");

    }
}
