package ayesha;

public class SumOf {
    public static void main(int m, int n, int q) {

        if (m + n > q)
            System.out.println("Q is less than others");
        else if (n + q > m)
            System.out.println("m is less than others");
        else if (m + q > n)
            System.out.println("n is less than others");
    }
}
