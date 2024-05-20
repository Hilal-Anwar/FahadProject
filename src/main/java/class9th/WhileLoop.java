package class9th;

public class WhileLoop {
    public static void main(String[] args) {
        int n = 97854;
        int r;
        while (n > 0) {
            //last digit extraction
            r = n % 10;
            System.out.println(r);
            //last one digit is removed
            n = n / 10;
        }
    }
}
