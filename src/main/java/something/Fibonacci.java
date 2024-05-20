package something;

public class Fibonacci {
    public static void main(String[] args) {
        System.out.println(countryCodeToEmoji("in"));
        long a = 0, b = 1;
        System.out.print(a + " , " + b);
        long c;
        for (int i = 3; i <= 10; i++) {
            c = 2*b+a;
            System.out.print(" , " + c);
            a = b;
            b = c;
        }
    }
    public static String countryCodeToEmoji(String code) {

        // offset between uppercase ASCII and regional indicator symbols
        int OFFSET = 127397;

        // validate code
        if(code == null || code.length() != 2) {
            return "";
        }

        //fix for uk -> gb
        if (code.equalsIgnoreCase("uk")) {
            code = "gb";
        }

        // convert code to uppercase
        code = code.toUpperCase();

        StringBuilder emojiStr = new StringBuilder();

        //loop all characters
        for (int i = 0; i < code.length(); i++) {
            emojiStr.appendCodePoint(code.charAt(i) + OFFSET);
        }

        // return emoji
        return emojiStr.toString();
    }
}
