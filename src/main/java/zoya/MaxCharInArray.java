package zoya;

import java.util.Scanner;

public class MaxCharInArray {
    public static void main(String[] args) {
        char[] a = new char[10];
        Scanner in = new Scanner(System.in);
        System.out.println("Enter 10 characters");
        for (int i = 0; i < 10; i++) {
            a[i] = in.nextLine().charAt(0);
        }
        char max = a[0];
        for (int i = 1; i < 10; i++) {
            if (a[i] > max)
                max = a[i];
        }
        System.out.println("Max character is " + max);
    }
}
