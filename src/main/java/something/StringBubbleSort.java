package something;

import java.util.*;

public class StringBubbleSort {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the size");
        int n = in.nextInt();
        int[] arr = new int[5];
        System.out.println("Enter your list of names");
        for (int i = 0; i < n; i++)
            arr[i] = in.nextInt();
        int temp;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < (n - 1 - i); j++) {
                if (arr[j + 1] > arr[j]) {
                    temp = arr[j + 1];
                    arr[j + 1] = arr[j];
                    arr[j] = temp;
                }

            }
        }
        for (int x:arr)
            System.out.println(x);
    }
}
