package zoya;

import java.util.Scanner;

public class SumOfDigits {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int arr[] = new int[10];
        System.out.println("Enter the 10 elements in the array");
        int sum[] = new int[10];
        for (int i = 0; i < 10; i++) {
            arr[i] = in.nextInt();
            int n = arr[i];
            int s = 0;
            while (n > 0) {
                s = s + n % 10;
                n = n / 10;
            }
            sum[i] = s;
        }
        for (int i = 0; i < 10; i++) {
            System.out.println(arr[i] + "\t\t\t" + sum[i]);
        }
    }
}
