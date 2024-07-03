package alvia;

import static java.lang.System.out;

public class Number {
    static int fac(int a) {
        return a < 10 ? (a * fac(a + 1)) : a;

    }

    static void for_each(int a[]) {
        for (int x : a) {
            out.println(x);
        }
    }

    public static void main(String[] args) {
        System.out.println(fac(1));
    }
}
