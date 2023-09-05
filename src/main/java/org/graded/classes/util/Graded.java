package org.graded.classes.util;

public class Graded {

    static void print() {
        System.out.println("hello from print funtion");
    }

    static void print1(String message) {
        //System.out.println(message);
    }

    static int fac(int n) {
        System.out.println("i was called with value of " + n);
        int f = 1;
        for (int i = 1; i <= n; i++) {
            f = f * i;
        }

        return f;
    }

    static int sum(int a, int b) {
        return a + b;
    }

    static double sum(double a, double b) {
        return  (a + b);
    }
    static float sum(float a, float b) {
        return  (a + b);
    }
    static int sum(byte a, byte b) {
        return  (a + b);
    }
    static void difference(int a,int b){

    }

}