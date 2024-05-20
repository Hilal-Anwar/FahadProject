package something;

import java.util.Scanner;

public class Zara {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int ch;
        ch = in.nextInt();
        switch (ch) {
            case 1:
            {
                for (int i = 1; i <= 5; i++) {
                    for (int j = 1; j <= i; j++) {
                        System.out.print(j + " ");
                    }
                    System.out.println();
                }
            }
            case 2:
            {
                for (int i = 5; i >= 1; i--) {
                    for (int j = 1; j <= i; j++) {
                        System.out.print(j + " ");
                    }
                    System.out.println();
                }
            }
            break;
        }
    }
}
