package class9th;

import java.util.Scanner;

public class MidNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter three numbers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int max = Math.max(a, Math.max(b, c));
        int min = Math.min(a, Math.min(b, c));
        System.out.println("Max number: " + max);
        System.out.println("Min number: " + min);
        int mid = (a + b + c) - (max + min);
        System.out.println("Mid number: " + mid);
    }
}
