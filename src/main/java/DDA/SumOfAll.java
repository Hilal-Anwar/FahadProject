package DDA;

import java.util.Scanner;

public class SumOfAll {
    public static void main(String[] args) {
        int a[] = new int[10];
        int sum = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 10 numbers");
        for (int i = 0; i < 10; i++) {
            a[i] = sc.nextInt();
        }
        for (int i = 0; i < 10; i++)
        {
            int n = a[i],t=n;
            int rev=0;
            while (n>0){
                int r=n%10;
                rev=rev*10+r;
                n=n/10;
            }
            if (t==rev)
                System.out.println(t);
        }
    }
}
