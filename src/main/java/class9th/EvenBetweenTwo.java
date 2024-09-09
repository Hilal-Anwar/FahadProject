package class9th;

import java.util.Scanner;

public class EvenBetweenTwo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, b;
        System.out.println("Enter the first number");
        a = sc.nextInt();
        double d = Math.sqrt(a) - Math.floor(Math.sqrt(a));
        if (d == 0)
            System.out.println("");
    }
}
