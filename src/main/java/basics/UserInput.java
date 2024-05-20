package basics;

import java.util.*;


public class UserInput {
    public static void main(String[] args) {
        System.out.println("Enter two numbers");
        int a, b;
        Scanner in = new Scanner(System.in);
        a = in.nextInt();
        b = in.nextInt();
        double A = Math.sqrt(a * a + b * b);
        System.out.println("The length of the diagonal is = "+A);
    }
}
