package something;

import java.util.Scanner;

public class Series13 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a number");
        int x = in.nextInt();
        System.out.println("Enter the value of N");
        int n = in.nextInt();
        double s = 1.0;
        for (int i = 2; i <= n; i++) {
            int f = 1;
            for (int j = 1; j <= i; j++) {
                f = f * j;
            }
            if (i % 2 == 0)
                s = s + Math.pow(x, i) / f;
            else
                s = s - Math.pow(x, i) / f;
        }
        System.out.println(s);
    }
}
