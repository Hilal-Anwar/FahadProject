package ClassX;

import java.util.Scanner;

public class LinearSearch {
    public static void main(String[] args) {
        int a[] = new int[10];
        Scanner in = new Scanner(System.in);
        System.out.println("Enter 10 numbers in the array");
        for (int i = 0; i < 10; i++) {
            a[i] = in.nextInt();
        }
        System.out.println("Enter the number to be searched");
        int n=in.nextInt();
        //linear search
        int c=0;
        for (int i = 0; i < 10; i++) {
            if (a[i]==n)
            {
                c=1;
                break;
            }
        }
        if (c==1)
            System.out.println("Number is present");
        else System.out.println("Number is not present");
    }
}
