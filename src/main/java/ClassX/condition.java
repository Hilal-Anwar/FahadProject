package ClassX;

import java.util.Scanner;

public class condition {
    public static void main(String[] args) {
        System.out.println("Enter your age");
        Scanner in = new Scanner(System.in);
        int age;
        age = in.nextInt();
        if (age >= 18)
        {
            System.out.println("You can vote");
        } else
        {
            System.out.println("You cannot vote");
        }

    }
}
