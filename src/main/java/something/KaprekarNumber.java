package something;

import java.util.*;

public class KaprekarNumber {
    public static void main(String[] args) {
        int n, sq, x = 1, c = 1;
        Scanner in = new Scanner(System.in);
        n = in.nextInt();
        sq = n * n;
        while (sq > 0) {
            sq = sq / 10;
            if (c % 2 == 0)
                x = x * 10;
            c++;
        }
        sq = n * n;
        if ((sq % x + sq / x == n) || ((sq % (x * 10) + sq / (x * 10) == n)))
        {
            System.out.println("Kaprekar Number");
        } else
        {
            System.out.println("Not Kaprekar Number");
        }
    }
}
