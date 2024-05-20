package ClassX;

import java.util.*;

public class BasicArray1 {
    public static void main(String[] args) {
        int[] a = new int[5];
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 5 elements:");
        for (int i = 0; i < 5; i++) {
            a[i] = sc.nextInt();
        }
        for (int i = 0; i < 5; i++) {
            int temp = a[i];
            System.out.println(a[i]*2);
        }
    }
}
