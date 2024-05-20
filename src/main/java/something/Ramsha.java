package something;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Ramsha {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a word");
        char[] w = in.nextLine().toLowerCase().toCharArray();
        System.out.println(Arrays.toString(w));
        Arrays.sort(w);
        String s = new String(w);
        System.out.println(s);
        System.out.println(IntStream.rangeClosed(s.charAt(0), s.charAt(s.length() - 1)).
                mapToObj(i -> String.valueOf((char) i)).collect(Collectors.joining()));
    }
}
