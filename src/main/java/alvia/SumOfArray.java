package alvia;

import java.util.Scanner;

public class SumOfArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] a = new int[10];
        System.out.println("Enter 10 numbers in the array");
        for (int i = 0; i < 10; i++) {
            a[i] = sc.nextInt();
        }
        int s = 0;
        for (int i = 0; i < 10; i++) {
            s = s + a[i];
        }
        System.out.println("The sum of the array is: " + s);
    }
}
