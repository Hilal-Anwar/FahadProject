package faizan;

public class SandwichNumber {
    public static void main(String[] args) {
        for (int i = 0; i <=10000; i++) {
        if (isSandwichNumber(i))
            System.out.println(i);
        }
    }

    public static boolean isSandwichNumber(int n) {
        double sq = Math.sqrt(n - 1);
        double cu = Math.cbrt(n + 1);
        int x = (int) sq;
        int y = (int) cu;
        return (sq - x == 0) && (cu - y == 0);
    }
}
