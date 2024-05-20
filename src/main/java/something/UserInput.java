package something;

import java.util.*;

public class UserInput {
    public static void main(String[] args) {
        int a, b, s;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the first number");
        a = in.nextInt();
        System.out.println("Enter the second number");
        b = in.nextInt();
        s = a + b;
        System.out.println(s);
    }
}
