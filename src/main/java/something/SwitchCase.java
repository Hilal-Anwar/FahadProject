package something;

import java.util.*;

public class SwitchCase {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int x;
        System.out.println("Input a number");
        x = in.nextInt();
        int r = x % 2;
        switch (r) {
            case 0:
                System.out.println("Even");
                break;
            default:
                System.out.println("Odd");
        }
    }
}
