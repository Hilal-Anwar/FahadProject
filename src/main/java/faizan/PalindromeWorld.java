package faizan;

import java.util.*;

public class PalindromeWorld {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a word");
        String word = in.nextLine();
        String sr = "";
        for (int i = 0; i < word.length(); i++) {
            char c = word.charAt(i);
            sr = c + sr;
        }
        if (sr.equals(word))
            System.out.println(" Palindrome World");
        else
            System.out.println("Not  Palindrome World");
    }
}
