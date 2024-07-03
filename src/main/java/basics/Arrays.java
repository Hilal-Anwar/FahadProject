package basics;

import java.util.Scanner;

public class Arrays {
    public static void main(String[] args) {
        int arr[] = new int[10];
        int a[] = {4, 9, 12, 1, 17};
        double d[] = new double[50];
        String st[] = new String[60];
        Scanner in = new Scanner(System.in);
        for (int i = 0; i < 10; i++) {
            arr[i] = in.nextInt();
        }
        for (int i = 0; i < 10; i++) {
            System.out.println(arr[i]);
        }
    }
}
