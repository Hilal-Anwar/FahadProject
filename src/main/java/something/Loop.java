package something;

public class Loop {
    public static void main(String[] args) {
        double i = 0, s = 0;
        while (i <= 20) {
            s = s + 1 / Math.pow(2, i);
            i++;
        }
        System.out.println(s);
    }
}
