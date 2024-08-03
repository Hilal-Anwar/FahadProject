package alvia;

import java.util.Scanner;

public class LinearSearch
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] a =new int[10];
        System.out.println("Enter 10 numbers in the array");
        for (int i = 0; i < 10; i++) {
            a[i]=sc.nextInt();
        }
        System.out.println("Enter the element to be searched");
        int n=sc.nextInt();
        int c=0;
        for (int i = 0; i < 10; i++)
        {
            if (a[i]==n)
            {
                c=1;
                break;
            }
        }
        if (c==1)
            System.out.println("Element found");
        else
            System.out.println("Element not found");
    }
}
