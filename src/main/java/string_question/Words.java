package string_question;

public class Words {
    public static void main(String[] args) {
        String w = null;
        String word = "Abdul";
        int l = word.length();
        char c;
        String rw = "";
        for (int i = 0; i < l; i++) {
            c = word.charAt(i);
            if (c == 'a' || c == 'A')
                rw = rw + "*";
            else
                rw = rw + c;
        }
        System.out.println("Replaced");
        System.out.print(rw);
    }
}
