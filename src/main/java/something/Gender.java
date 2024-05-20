package something;

import java.util.Scanner;

public class Gender {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter M for male");
        System.out.println("Enter F for female");
        System.out.println("Enter your choice");
        char ch;
        ch = in.next().charAt(0);
        switch (ch) {
            case 'M':
                System.out.println("Your are male");
                break;
            case 'F': {
                System.out.println("Your are female");
                break;
            }
            default:
                System.out.println("Unknown gender");
        }
    }
}
