package string_question;

public class StringBasic {
    public static void main(String[] args) {
        String s=" Java and bluej ";
        /*
        s=J a v a  a n d  b l u  e  j
          0 1 2 3 4 5 6 7 8 9 10 11 12
         */
        System.out.println(s.length());
        System.out.println(s.charAt(13));
        System.out.println(s.indexOf('a'));
        System.out.println(s.lastIndexOf('a'));
        System.out.println(s.toUpperCase());
        System.out.println(s.toLowerCase());
        System.out.println(s.trim());
        System.out.println(s.substring(1,5));

    }
}
