package alvia;

import java.util.Scanner;
/*
153=1*1*1+2*2*2+3*3*3=153
 */
public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n;
        System.out.println("Enter a number");
        n = in.nextInt();
        int s = 0;
        int t = n;
        while (n > 0) {
            int r = n % 10;//last digit of the number
            s = s + r * r * r;
            n = n / 10;//last digit is removed
        }
        if (s == t)
            System.out.println("Armstrong number");
        else
            System.out.println("Not armstrong number");
    }
}
