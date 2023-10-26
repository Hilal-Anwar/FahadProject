package org.graded.classes.core;

import java.util.Arrays;

public class Recursion {
    void a(int i) {
        System.out.println("I am in side a()");
        if (i < 5)
            a(i + 1);
    }

    int factorial(int n) {
        return n > 1 ? (n * factorial(n - 1)) : n;
    }
    void draw_rectangle(int w,int h,Color c ){

    }

    public static void main(String[] args) {
        Recursion r = new Recursion();
        r.a(0);
        System.out.println(Arrays.toString(Color.values()));
        r.draw_rectangle(5,4,Color.GREEN);
        System.out.println(r.factorial(5));
    }
}
