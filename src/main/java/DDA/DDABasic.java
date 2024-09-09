package DDA;

import java.util.Arrays;
import java.util.Scanner;

public class DDABasic {
    public static void main(String[] args) {
        int a[][]=new int[2][2];
        Scanner sc=new Scanner(System.in);
         /*
        [[0,0],[0,0]]
          0 1   0 1
           0     1

           0 0 0
           0 0 0

           2 0 0 0 0
           0 3 0 0 0
           0 0 4 0 0
           0 0 0 6 0
           0 0 0 0 7
         */
//        a[0][0]=sc.nextInt();
//        a[0][1]=sc.nextInt();
//        a[1][0]=sc.nextInt();
//        a[1][1]=sc.nextInt();
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                a[i][j]=sc.nextInt();
            }
        }
        for (int i = 0; i < 2; i++) {
            int s=0;
            for (int j = 0; j < 2; j++)
            {

                s=s+a[i][j];
            }
            System.out.println("THE SUM OF "+i+" row is "+s);
        }
    }
}
