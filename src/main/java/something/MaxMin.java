package something;

public class MaxMin {
    public static void main(String[] args) {
        int h = 0, t = 0;
        for (int i = 1; i <= 20; i++) {
            int x = (int) (Math.random() * 2);
            if (x == 0)
                t++;
            else
                h++;
        }
        System.out.println("Head is = "+h);
        System.out.println("Tail is = "+t);
    }
}
