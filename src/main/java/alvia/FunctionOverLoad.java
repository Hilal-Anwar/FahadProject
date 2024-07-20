package alvia;

public class FunctionOverLoad {
    void number(int n) {
        int z = n;
        int s = 0;
        while (n > 0) {
            int r = n % 10;
            s = s * 10 + r;
            n = n / 10;
        }
        if (s == z)
            System.out.println("Palendrome number");
        else
            System.out.println("Not a palendrome number");
    }

    void number(double t) {
        int n = (int) t;
        double z = n;
        int s = 0;
        while (n > 0) {
            int r = n % 10;
            s = s + r * r * r;
            n = n / 10;
        }
        if (s == z)
            System.out.println("Armstrong number");
        else
            System.out.println("Not a armstrong number");
    }

    void number(long n) {
        long z = n;
        long sq = n * n;
        int c = 0;
        while (n > 0) {
            n = n / 10;
            c++;
        }
        long e = (long) (sq % Math.pow(10, c));
        if (e == z)
            System.out.println("Automorphic number");
        else
            System.out.println("Not a automorphic number");
    }

    public static void main(String[] args) {
        FunctionOverLoad f = new FunctionOverLoad();
        f.number(121.0);
    }
}
