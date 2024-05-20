package something;

public class DigitExtraction {
    public static void main(String[] args) {
        int n = 147852;
        for (int i = n; i > 0; i = i / 10)
        {
            int r = i % 10;//extract the last digit
            System.out.println(r);
        }
    }
}
