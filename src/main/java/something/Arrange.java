package something;

public class Arrange {
    public static void main(String[] args) {
        int a = 2586;
        String s = "";
        for (int i = 9; i >= 0; i--) {
            int n = a;
            while (n > 0) {
                int r = n % 10;
                if (r == i)
                    s = s + r;
                n = n / 10;
            }
        }

        System.out.println(s);
    }
}
