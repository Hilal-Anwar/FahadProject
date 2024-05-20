package faizan;

import java.util.*;

public class Volume {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter 1 to find volume of cuboid");
        System.out.println("Enter 2 to find volume of cylinder");
        System.out.println("Enter 3 to find volume of cone");
        int ch;
        System.out.println("Enter your choice");
        ch = in.nextInt();
        switch (ch) {
            case 1:
                int l, b, h;
                System.out.println("Enter the length");
                l = in.nextInt();
                System.out.println("Enter thr breadth");
                b = in.nextInt();
                System.out.println("Enter the height");
                h = in.nextInt();
                int v1 = l * b * h;
                System.out.println("Volume of cuboid " + v1);
                break;
            case 2:
                System.out.println("Enter  the radius of cylinder");
                int r = in.nextInt();
                System.out.println("Enter the length of height");
                int k = in.nextInt();
                double v2 = 3.14 * r * r * k;
                System.out.println("Volume of cylinder is " + v2);
                break;
            case 3:
                System.out.println("Enter the radius of cone");
                int r1 = in.nextInt();
                System.out.println("Enter the height of cone");
                int h1 = in.nextInt();
                double v3 = 1.0 / 3 * 22.0 / 7 * r1 * r1 * h1;
                System.out.println("The volume of cone is = " + v3);
                break;
            default:
                System.out.println("Invalid input");
        }
    }
}
