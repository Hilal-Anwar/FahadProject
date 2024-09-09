package string_question;

public class CharFunc {
    public static void main(String[] args) {
        char a = 'a', b = 'B', c = '1', d = '*', e = ' ';
        System.out.println(Character.isLowerCase(a));
        System.out.println(Character.isLetter(a));
        System.out.println(Character.isUpperCase(b));
        System.out.println(Character.isDigit(c));
        System.out.println(Character.isWhitespace(e));
    }
}
