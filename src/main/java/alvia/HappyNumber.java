package alvia;

public class HappyNumber {
    public static void main(String[] args) {
        int n = 49;
        while (n != 1)
        {
            int x = n;
            int s = 0, r;
            while (x > 0) {
                r = x % 10;
                s = s + r * r;
                x = x / 10;
            }
            n = s;
        }
        System.out.println("Happy Number");
    }
}
