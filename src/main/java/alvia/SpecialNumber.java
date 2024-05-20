package alvia;

public class SpecialNumber {
    public static void main(String[] args) {
        int n = 145;
        /*
        1!+4!+5!=1+24+120=145
         */
        int d, s = 0, t = n;
        while (n > 0) {
            d = n % 10;
            int f = 1;
            for (int i = 1; i <= d; i++) {
                f = f * i;
            }
            s = s + f;
            n = n / 10;
        }
        if (s == t)
            System.out.println("Special Number");
        else
            System.out.println("Not a special number");
    }
}
