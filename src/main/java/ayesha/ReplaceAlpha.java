package ayesha;

import java.util.Scanner;

public class ReplaceAlpha {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a word");
        String s = in.nextLine();
        int l = s.length();
        String s1 = "";
        for (int i = 0; i < l; i++) {
            char c = s.charAt(i);
            if (c == 'a' || c == 'A')
                s1 = s1 + "*";
            else
                s1 = s1 + c;
        }
        System.out.println(s1);
    }
}
