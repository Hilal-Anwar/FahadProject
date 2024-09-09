package class9th;

public class TwinPrime {
    public static void main(String[] args) {
        int n = 13;
        //prime
        int c = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0)
                c = c + 1;
        }
        //reverse
        int s = 0, r;
        while (n > 0) {
            r = n % 10;
            s = s * 10 + r;
            n = n / 10;
        }
        int d = 0;
        for (int i = 1; i <= s; i++) {
            if (s % i == 0)
                d = d + 1;
        }
        if (c==2 && d==2)
            System.out.println("Twin prime");
        else
            System.out.println("Not Twin prime");

    }
}
