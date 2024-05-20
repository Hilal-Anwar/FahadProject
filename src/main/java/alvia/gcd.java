package alvia;

public class gcd {
    public static void main(String[] args) {
        int a = 45, b = 25;
        int mx = Math.max(a, b);
        int mi = Math.min(a, b);
        int tem;
        while (mx % mi != 0) {
            tem = mi;
            mi = mx % mi;
            mx = tem;
        }
        System.out.println("Hcf is = " + mi);
    }
}
