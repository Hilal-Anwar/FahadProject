package something;

import java.util.Scanner;

public class NestedLoop {
    public static void main(String[] args) {
        double s = 1.0;
        Scanner in = new Scanner(System.in);
        int x = in.nextInt();
        for (int i = 2; i <= 10; i++) {
            int f = 1;
            for (int j = 1; j <= i; j++) {
                f = f * i;
            }
            if (i % 2 == 0)
                s = s + Math.pow(x, i) / f;
            else
                s = s - Math.pow(x, i) / f;
        }
    }
}
