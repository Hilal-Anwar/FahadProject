package class9th;

public class Numbers {
     public int prime(int n) {
        int c = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                c = c + 1;
            }
        }
        if (c == 2)
            return 1;
        else
            return 0;
    }

    public int palindrome(int n) {
        int x = n, s = 0;
        while (n > 0) {
            int r = n % 10;
            s = s * 10 + r;
            n = n / 10;
        }
        if (s==x)
            return 1;
        else return 0;
    }
}
