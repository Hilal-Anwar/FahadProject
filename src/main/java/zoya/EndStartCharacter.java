package zoya;

import java.util.Scanner;

public class EndStartCharacter {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = 10;
        String[] a = new String[n];
        System.out.println("Enter " + n + " names");
        for (int i = 0; i < 10; i++) {
            a[i] = in.nextLine();
        }
        System.out.printf("%s \t\t %s", "Name", "First and Last Character");
        for (int i = 0; i < 10; i++) {
            System.out.printf("%s \t\t %s", a[i], a[i].charAt(0) + a[i].charAt(a[i].length() - 1));
        }
    }
}
