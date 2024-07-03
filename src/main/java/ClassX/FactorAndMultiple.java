package ClassX;

import java.util.*;

public class FactorAndMultiple {
    public static void main(String[] args) {
        System.out.println("Enter your number");
        Scanner in = new Scanner(System.in);
        int num;
        num = in.nextInt();
        int rem = 12 % num;
        if (rem == 0) {
            System.out.println("Factor of 12");
        } else {
            System.out.println("Not a factor of 12");
        }
    }
}
