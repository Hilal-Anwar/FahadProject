package faizan;

import java.util.*;

public class FirstUpper {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a  sentence");
        String sent = in.nextLine();
        String s1 = (""+sent.charAt(0)).toUpperCase();
        int l = sent.length();
        for (int i = 1; i < l; i++) {
            char c = sent.charAt(i);
            if (c == ' ') {
                s1 = s1 + (" " + sent.charAt(i + 1)).toUpperCase();
                i++;
            } else s1 = s1 + c;
        }
        System.out.println(s1);
    }
}
