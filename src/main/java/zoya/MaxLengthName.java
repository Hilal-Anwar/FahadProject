package zoya;

import java.util.Scanner;

public class MaxLengthName {
    public static void main(String[] args) {
        System.out.println("Enter size of array");
        Scanner in = new Scanner(System.in);
        int n=in.nextInt();
        String[] a = new String[n];
        System.out.println("Enter "+n+" names");
        for (int i = 0; i < 10; i++) {
            a[i] = in.nextLine();
        }
        String max = a[0];
        for (int i = 1; i < 10; i++) {
            if (a[i].length() > max.length())
                max = a[i];
        }
        System.out.println("Name with max length is " + max);
    }
}
