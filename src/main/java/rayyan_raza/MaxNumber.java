package rayyan_raza;

import java.util.Scanner;

public class MaxNumber {
    public static void main(String[] args) {
        int[] a = new int[10];
        Scanner in = new Scanner(System.in);
        System.out.println("Enter 10 numbers");
        //entry of array
        for (int i = 0; i < 10; i++) {
            a[i] = in.nextInt();
        }
        int max = a[0], min = a[0];
        for (int i = 1; i < 10; i++) {
            if (a[i] > max)
                max = a[i];
            if (a[i] < min)
                min = a[i];
        }
        System.out.printf("%s %d  %s %d", "The max and min is  = ", max, ",", min);
    }
}
