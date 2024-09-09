package string_question;

public class Init {
    public static void main(String[] args) {
        String s="Zoya zayan";
        int l=s.length();
        for (int i = 0; i <l; i++) {
            char c=s.charAt(i);
            for (int j = 0; j <=i; j++) {
                System.out.print(" ");
            }
            System.out.println(c);
        }
    }
}
