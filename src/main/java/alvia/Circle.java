package alvia;

import java.util.Scanner;

public class Circle {
    int r;
    double a, c;

    void input() {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the radius");
        r = in.nextInt();
    }

    void compute()
    {
        c = 2 * 3.14 * r;
        a = 3.14 * r * r;
    }

    void show() {
        System.out.println("The circumference is =  " + c);
        System.out.println("The area is = " + a);
    }

    public static void main(String[] args) {
        Circle c = new Circle();
        c.input();
        c.compute();
        c.show();
    }
}
