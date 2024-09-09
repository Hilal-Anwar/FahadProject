package class9th;

import java.util.*;

public class Numbers {
    public static void main(String[] args)
    {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number");
        n = sc.nextInt();
        int r, s = 0;
        int t = n;
        while (n > 0) {
            r = n % 10;
            s = s * 10 + r;
            n = n / 10;
        }
        if (t == s)
            System.out.println("Palindrome number");
        else
            System.out.println("Not palindrome number");
    }
}
