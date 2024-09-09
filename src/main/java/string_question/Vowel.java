package string_question;

import java.util.Scanner;

public class Vowel {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String vowels = sc.nextLine();
        int s = 0;
        int l = vowels.length();
        for (int i = 0; i < l; i++) {
            char ch = vowels.charAt(i);
            if (ch == 'a' || ch == 'A' || ch == 'e' || ch == 'E' ||
                    ch == 'i' || ch == 'I' || ch == 'o' || ch == 'O' ||
                    ch == 'u' || ch == 'U') {
                s = s + (int) ch;
            }
        }
        System.out.println("Sum of all Vowel " + s);
    }
}
