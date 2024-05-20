package alvia;

import java.util.*;

public class DisariumNumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a, b, c, max, min, max1;
        System.out.println("Enter two numbers");
        a = in.nextInt();
        b = in.nextInt();
        c = in.nextInt();
        max = a > b ? a : b;
        min = a < b ? a : b;
        System.out.println(max + "   " + min);
        max1 = (a > b && a > c) ? a : (b > a && b > c) ? b : c;
        System.out.println(max1);

    }
}
