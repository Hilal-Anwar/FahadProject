package faizan;

import java.util.*;

public class Conditional {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num;
        System.out.println("Enter a number");
        num = in.nextInt();
        if (num % 2 == 0)
        {
            System.out.println("even");
        }
        else
        {
            System.out.println("odd");
        }
    }
}
