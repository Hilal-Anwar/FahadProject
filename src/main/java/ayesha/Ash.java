package ayesha;

import java.util.Arrays;
import java.util.Scanner;

public class Ash {
    public static void main(String[] args) {
        int[] r = new int[5];
        String box[][]=new String[3][3];
        box[1][1]="X";
        for (int i = 0; i <3 ; i++) {
            for (int j = 0; j <3 ; j++) {
                if (box[i][j]!=null)
                System.out.print(box[i][j]+" ");
                else
                    System.out.print("_ ");
            }
            System.out.println();
        }
    }
}
