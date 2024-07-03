package zoya;

import java.util.Scanner;

public class MaxMin {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter 10 number");
        int n;
        int max = in.nextInt();
        int min = max;
        for (int i = 1; i < 10; i++) {
            n = in.nextInt();
            min = Math.min(n, min);
            max = Math.max(n, max);
        }
        System.out.println("The sum of of max and min  " + (max + min));
        System.out.println("The product of of max and min  " + (max * min));
    }
}
