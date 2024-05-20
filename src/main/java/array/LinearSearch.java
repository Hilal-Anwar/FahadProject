package array;

import java.util.Scanner;

public class LinearSearch {
    public static void main(String[] args) {
        int[] a = new int[10];
        Scanner in = new Scanner(System.in);
        //Input
        for (int i = 0; i < 10; i++) {
            a[i] = in.nextInt();
        }
        System.out.println("Enter the number to be searched");
        int N = in.nextInt();
        int c = 0;
        for (int i = 0; i < 10; i++) {
            if (a[i] == N) {
                c = 1;
                break;
            }
        }
        if (c == 1)
            System.out.println("Number is present");
        else
            System.out.println("Number is not present");
    }
}
