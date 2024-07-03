package zoya;

import java.util.Arrays;
import java.util.stream.IntStream;

public class StringQuestion {
    public static void main(String[] args) {
        System.out.println(hasRepeatChar("Helal"));
        String s = "I love to code helal";
        String s1 = "";
        s = s + " ";
        int cr = 0;
        int wo = 0;
        for (int i = 0; i < s.length(); i++) {
            char z = s.charAt(i);
            if (z != ' ')
                s1 = s1 + z;
            else {
                wo++;
                int c = 0;
                for (int j = 0; j < s1.length(); j++) {
                    char r = s1.charAt(j);
                    c = 0;
                    for (int k = 0; k < s1.length(); k++) {
                        if (r == s1.charAt(k))
                            c++;
                    }
                    if (c > 1)
                        break;
                }
                if (c == 1) {
                    System.out.print(s1 + " ");
                    cr++;
                }
                s1 = "";
            }
        }
        System.out.println();
        System.out.println("No of non unique word is :" + (wo - cr));
    }
    public static boolean hasRepeatChar(String str) {
        var arr_str = str.toCharArray();
        Arrays.sort(arr_str);
        return IntStream.range(0, arr_str.length - 1).anyMatch(z -> arr_str[z] == arr_str[z + 1]);
    }
}
