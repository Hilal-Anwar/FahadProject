package alvia;

public class LetterPattern {
    public static void main(String[] args) {
        for (int i = 'A'; i <= 'Z'; i++) {
            for (int j = 'A'; j <= i; j++) {

                System.out.print((char) j+"  ");
            }
            System.out.println();
        }
    }
}
