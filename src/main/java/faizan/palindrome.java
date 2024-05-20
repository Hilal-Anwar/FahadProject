package faizan;

public class palindrome {
    public static void main(String[] args) {
        int c=0;
        for (int i = 100; i <= 9999; i++) {
            int n = i;
            int t = n;
            int r, s = 0;
            while (n > 0) {
                r = n % 10;
                s = s * 10 + r;
                n = n / 10;
            }
            if (s == t){
                System.out.println("Palindrome "+i);
                c++;
            }
        }
        System.out.println(c);
    }
}
