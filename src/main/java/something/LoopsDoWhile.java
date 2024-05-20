package something;

import java.util.Scanner;

public class LoopsDoWhile {
    public static void main(String[] args) {
        //Armstrong number
        Scanner in = new Scanner(System.in);
        int n, s = 0;
        System.out.println("Input a number");
        n = in.nextInt();
        int tem = n;
       /* while (n > 0)
        {
            int r = n % 10;
            s = s + r * r * r;
            n = n / 10;
        }*/
        for (int i = n; i > 0; i = i / 10) {
            int r = i % 10;
            s = s + r * r * r;
        }
        if (n == s)
            System.out.println("Armstrong");
        else
            System.out.println("Not a Armstrong number");
    }
}
