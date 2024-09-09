package string_question;

public class CharType {
    public static void main(String[] args) {
        char x = '1';
        System.out.println((int)x);
        int y = 1;

        for (int i = 1; i <= 20000; i++) {
            char ch = (char) i;
            System.out.print(", ("+i+") "+ch);
            if (i % 10 == 0)
                System.out.println();
        }
    }
}
