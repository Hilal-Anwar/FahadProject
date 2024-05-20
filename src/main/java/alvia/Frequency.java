package alvia;

import java.util.*;

public class Frequency {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = in.nextInt();
        for (int i = 0; i <= 9; i++)
        {
            int c = 0;
            int s = n;
            while (s > 0) {
                int r = s % 10;
                if (r == i)
                    c++;
                s = s / 10;
            }
            if (c > 0)
                System.out.println("The digit " + i + " is present " + c + " times");
        }
    }
}
