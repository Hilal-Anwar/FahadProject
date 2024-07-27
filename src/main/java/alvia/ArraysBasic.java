package alvia;

import java.util.Scanner;

public class ArraysBasic {
    public static void main(String[] args) {
        // Data_type name[]=new Data_type[size];
        int ayesha[] = new int[10];
        /*
        ayesha
        [0,0,0,0,0,0,0,0,0,0]
         0 1 2 3 4 5 6 7 8 9
         */
        ayesha[5] = 568;
        ayesha[0] = -7945;
        int z= ayesha[3];
        int y= ayesha[5];
        System.out.println(z);
        System.out.println(y);
        System.out.println(ayesha[0]+ ayesha[1]+ ayesha[2]+ ayesha[3]);

        Scanner in=new Scanner(System.in);
        //entry of array
        System.out.println("Enter 10 numbers : ");
        for (int i = 0; i < 10; i++) {
            ayesha[i]=in.nextInt();
        }
        //print of array
        for (int i = 0; i < 10; i++) {
            System.out.println(ayesha[i]);
        }

    }
}
