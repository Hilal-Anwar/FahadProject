package ClassX;

import java.util.*;

public class SelectionSort {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] a = new int[10];
        System.out.println("Enter 10 numbers");
        for (int i = 0; i < 10; i++) {
            a[i] = in.nextInt();
        }
        //sort
        int min;
        for (int i = 0; i < 10; i++) {
            min = i;
            //this loop finds the minimum index in the array
            for (int j = i + 1; j < 10; j++) {
                if (a[j] < a[min])
                    min = j;
            }
            //Swaping
            int tem = a[min];
            a[min] = a[i];
            a[i] = tem;
        }
        for (int i = 0; i < 10; i++) {
            System.out.println(a[i]);
        }
    }
}
