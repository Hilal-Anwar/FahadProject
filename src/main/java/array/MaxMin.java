package array;

import java.util.*;

public class MaxMin {
    public static void main(String[] args) {
        int[] a = new int[10];
        Scanner in = new Scanner(System.in);
        //Input
        for (int i = 0; i < 10; i++) {
            a[i] = in.nextInt();
        }
        int max = a[0];
        int min = a[0];
        int maxIndex=0, minIndex=0;
        for (int i = 0; i < 10; i++) {
            if (a[i] > max) {
                max = a[i];
                maxIndex = i;
            }
            if (a[i] < min) {
                min = a[i];
                minIndex=i;
            }

        }
        System.out.println("Max element is =" + max);
        System.out.println("Max index is = "+(maxIndex+1));
        System.out.println("Min is = " + min);
        System.out.println("Min index is = "+(minIndex+1));
    }
}
