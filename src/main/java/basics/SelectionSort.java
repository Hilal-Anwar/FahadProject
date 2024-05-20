package basics;

import java.util.Scanner;

public class SelectionSort {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int n = in.nextInt();
        int[] a = new int[n];
        //entry of array
        for (int i = 0; i < n; i++) {
            a[i] = in.nextInt();
        }
        //sorting
        for (int i = 0; i < n; i++)
        {
            int min = i;
            for (int j = i; j < n; j++) {
                if (a[j] < a[min])
                    min = j;
            }
            int t = a[i];
            a[i] = a[min];
            a[min] = t;
        }
        //sorted array
        for (int i = 0; i < n; i++) {
            System.out.println(a[i]);
        }
    }
}
