package something;

import java.util.*;

class pg {
    public static void main(String []args) {
        Scanner in = new Scanner(System.in);
        int n, sq, d=0, sd=0;
        System.out.println("Enter a no");
        n = in.nextInt();
        sq = n * n;
        if (sq <= 99) {
            d = sq % 10;
            sd = sq / 10;
        }
        if (sq >= 100) {
            d = sq % 100;
            sd = sq / 100;
        }
        if (d == sd) {
            System.out.println("kaperkar no");
        } else {
            System.out.println("Not a kaperkar no");
        }
    }
}