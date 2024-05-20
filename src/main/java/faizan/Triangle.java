package faizan;

import java.util.Scanner;

public class Triangle {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int b, h;
        System.out.println("Enter the base and height");
        b = in.nextInt();
        h = in.nextInt();
        double hy;
        //hy=Math.sqrt(b*b+h*h);
        hy = Math.hypot(b,h);
        System.out.println(hy);
    }
}
