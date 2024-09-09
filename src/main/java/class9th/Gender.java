package class9th;

import java.util.Scanner;

public class Gender {
    public static void main(String[] args) {
        char g;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter f or m");
        g = sc.next().charAt(0);
        switch (g) {
            case 'm','M':
                System.out.println("Male");
                break;
            case 'f','F':
                System.out.println("Female");
                break;
            default:
                System.out.println("Invalid Gender");
        }
    }
}
