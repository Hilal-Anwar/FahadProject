package basics;

import java.util.Scanner;

public class BubbleSort {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int n = in.nextInt();
        int []a = new int[n];
        //entry of array
        for (int i = 0; i < n; i++) {
            a[i] = in.nextInt();
        }
        //sorting start
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - 1 - i; j++) {
                if (a[j] > a[j + 1]) {
                    int t = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = t;
                }
            }
        }
        //sorted array
        for (int i = 0; i < n; i++) {
            System.out.println(a[i]);
        }

    }
}
