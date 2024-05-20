package alvia;

import java.util.Scanner;

public class Arrays {
    public static void main(String[] args) {
        int[] a = new int[5];
        Scanner in = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            a[i] = in.nextInt();
        }
        for (int i = 0; i < 5; i++) {
            System.out.println(a[i]);
        }
    }
}
