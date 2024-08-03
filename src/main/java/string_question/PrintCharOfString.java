package string_question;

import java.util.Scanner;

public class PrintCharOfString {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String s = in.nextLine();
        int l = s.length();
        String s1="";
        for (int i = 0; i < l; i++) {
            char ch = s.charAt(i);
            s1=ch+s1;
            System.out.println(s1);
        }

    }
}
