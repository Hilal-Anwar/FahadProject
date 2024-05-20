package faizan;

import java.util.*;

public class UniqueWord {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a word");
        String word = in.nextLine();
        word = word.toUpperCase();
        int k = 0;
        for (int i = 65; i <= 90; i++) {
            int c = 0;
            for (int j = 0; j < word.length(); j++) {
                char ch = word.charAt(j);
                if (ch == i)
                    c++;
            }
            if (c > 1) {
                k = 1;
                break;
            }
        }
        if (k == 0)
            System.out.println("Unique word");
        else System.out.println("Not a unique word");

    }
}
