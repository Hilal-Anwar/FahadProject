package something;

public class Rev {
    public static void main(String[] args) {
        int n = 123;
        int s = 0, t = 0;
        for (int i = n; i > 0; i = i / 10) {
            int r = i % 10;
            t = t * 10 + r;
        }
        int j = n;
        while (j > 0) {
            int r = j % 10;
            s = s * 10 + r;
            j = j / 10;
        }
        System.out.println(n);
    }
}
