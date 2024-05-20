package string_question;

public class DoWhile {
    public static void main(String[] args) {
        int n = 113;
        int i = 1, c = 0;
        do {
            if (n % i == 0)
                c++;
            i++;
        }
        while (i <= n);
        if (c == 2)
            System.out.println("Prime");
        else System.out.println("Not a prime");
    }
}
