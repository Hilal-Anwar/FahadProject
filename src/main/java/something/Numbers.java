package something;

import java.util.Scanner;

public class Numbers {
    public static void main(String[] args) {
        Scanner ni = new Scanner(System.in);
        System.out.println("Enter a number");
        int n;
        n = ni.nextInt();
        while (n >9) {
            n = n / 10;// remove the last digit from the number
        }
        System.out.println(n);
    }
}
