package alvia;

import java.util.Scanner;

public class ArraysBasic {
    public static void main(String[] args) {
        // Data_type name[]=new Data_type[size];
        int alvia[] = new int[10];
        /*
        alvia
        [0,0,0,0,0,0,0,0,0,0]
         0 1 2 3 4 5 6 7 8 9
         */
        alvia[5] = 568;
        alvia[0] = -7945;
        int z= alvia[3];
        int y= alvia[5];
        System.out.println(z);
        System.out.println(y);
        System.out.println(alvia[0]+ alvia[1]+ alvia[2]+ alvia[3]);

        Scanner in=new Scanner(System.in);
        //entry of array
        System.out.println("Enter 10 numbers : ");
        for (int i = 0; i < 10; i++) {
            alvia[i]=in.nextInt();
        }
        //print of array
        for (int i = 9; i >=0; i--) {
            System.out.println(alvia[i]);
        }

    }
}
