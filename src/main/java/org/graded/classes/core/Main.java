package org.graded.classes.core;

public class Main {
    public static void main(String[] args) {
        var t = 10;
        System.out.println(t);
        CoreFunctions c = new CoreFunctions();
        int i = 1;
        do {
            System.out.println(i);
            i++;
        } while (i <= 10);
        int[] a = {5, 9, 512, 464, 214, 54};
        for (var b : a) {
            System.out.println(b);
        }
    }
}
