package string_question;

import java.util.Scanner;

public class even {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a letter");
        char c = in.nextLine().toLowerCase().charAt(0);
        switch (c) {
            case 'a', 'e', 'i', 'o', 'u':
                System.out.println("Vowel hai");
                break;
            default:
                System.out.println("Not a vowel");
        }
    }
}
