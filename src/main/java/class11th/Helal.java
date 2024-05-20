package class11th;

import class9th.Numbers;

public class Helal {
    public static void main(String[] args) {
        Numbers n = new Numbers();
        int x=n.prime(23);
        int y=n.palindrome(122);
        System.out.println(x);
        System.out.println(y);
    }
}
