package ClassX;

import java.util.Scanner;

public class PerfectSq {
    public static void main(String[] args) {
        System.out.println("Enter your number");
        Scanner in = new Scanner(System.in);
        int num;
        num = in.nextInt();
        double z = Math.sqrt(num);
        int y = (int) z;
        if (y == z) {
            System.out.println("Perfect sq");
        } else {
            System.out.println("Not a perfect sq");
        }
    }
}
