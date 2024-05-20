package ClassX;

import java.util.Scanner;

public class factor {
    public static void main(String[] args) {
        int[] a = new int[10];
        Scanner in=new Scanner(System.in);
        for (int i = 0; i < 10; i++) {
            a[i]=in.nextInt();
        }
        int s=0;
        for (int i = 0; i < 10; i++) {
            s=s+a[i];
        }
        System.out.println(s);
    }
}
