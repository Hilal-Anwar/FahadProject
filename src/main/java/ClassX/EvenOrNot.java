package ClassX;

import java.util.Scanner;

public class EvenOrNot {
    public static void main(String[] args)
    {
        System.out.println("Enter your number");
        Scanner in = new Scanner(System.in);
        int num;
        num = in.nextInt();
        int rem = num % 2;
        if (rem == 0)
        {
            System.out.println("Number is even");
        }
        else
        {
            System.out.println("Number is odd");
        }

    }
}
