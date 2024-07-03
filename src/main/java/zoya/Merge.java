package zoya;

import java.util.Scanner;

public class Merge {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a[] = new int[5];
        int b[] = new int[7];
        System.out.println("Enter the 5 elements in the array");
        for (int i = 0; i < 11; i++) {
            a[i] = in.nextInt();
        }
        System.out.println("Enter the 7 elements in the array");
        for (int i = 0; i < 11; i++) {
            b[i] = in.nextInt();
        }
        int[] res = new int[a.length + b.length];
        int p = 0;
        int last = Math.max(a.length, b.length);
        for (int i = 0; i != last; i++) {
            if (i < a.length) res[p++] = a[i];
            if (i < b.length) res[p++] = b[i];
        }
        for (int i = 0; i < res.length; i++) {
            System.out.println(res[i]);
        }
    }
}
