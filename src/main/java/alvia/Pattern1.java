package alvia;

public class Pattern1 {
    public static void main(String[] args) {
        int k = 1;
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                if (i % 2 == 0)
                    System.out.print("*  ");
                else {
                    System.out.print(k+"  ");
                    k++;
                }
            }
            System.out.println();
        }
    }
}
