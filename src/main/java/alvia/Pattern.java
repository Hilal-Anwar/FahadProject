package alvia;

public class Pattern {
    public static void main(String[] args) {
        int k = 1;
        for (int i = 5; i >= 1; i--) {
            for (int j = i; j >= 1; j--) {
                if (j % 2 != 0)
                    System.out.print(j + "  ");
                else
                    System.out.print("*  ");
            }
            System.out.println();
        }
    }
}
