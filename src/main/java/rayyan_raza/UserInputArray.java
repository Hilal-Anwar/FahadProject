package rayyan_raza;

import java.util.Scanner;

public class UserInputArray {
    public static void main(String[] args) {
        int[] a = new int[10];
        Scanner in = new Scanner(System.in);
        System.out.println("Enter 10 numbers");
        //entry of array
        for (int i = 0; i < 10; i++) {
            a[i] = in.nextInt();
        }
        //print of array
        for (int i = 9; i >=0; i--) {
            System.out.println(a[i]);
        }
    }
}
