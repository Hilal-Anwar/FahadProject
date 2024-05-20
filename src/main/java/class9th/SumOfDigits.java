package class9th;

import java.util.Scanner;

public class SumOfDigits {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = in.nextInt();
        int r;
        int s = 0;
        while (n > 0) {
            //last digit extraction
            r = n % 10;
            s = s + r;
            //last one digit is removed
            n = n / 10;
        }
        System.out.println(s);
    }
}
