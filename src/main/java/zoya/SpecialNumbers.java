package zoya;

import java.util.Scanner;

public class SpecialNumbers {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int arr[] = new int[10];
        System.out.println("Enter the 10 elements in the array");
        for (int i = 0; i < 10; i++) {
            arr[i] = in.nextInt();
            int n = arr[i];
            int s = 0;
            while (n > 0) {
                int r = n % 10;
                int f = 1;
                for (int j = 1; j <= r; j++) {
                    f = f * i;
                }
                s = s + f;
                n = n / 10;
            }
            if (s == arr[i])
                System.out.println(arr[i]);
        }
    }
}
