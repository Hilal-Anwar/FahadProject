package something;

public class Bell {
    public static void main(String[] args) {
        int x = 1, y = 2;
        System.out.print(x + " , " + y);
        for (int i = 3; i <= 20; i++) {
            int k = y * 2 + x;
            System.out.print(" , " + k);
            x=y;
            y=k;

        }
    }
}
