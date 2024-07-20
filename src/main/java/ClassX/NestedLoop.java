package ClassX;

public class NestedLoop {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            int k = 7;
            for (int j = 1; j <= i; j++) {

                System.out.print(k + " ");
                k++;
            }
            System.out.println();
        }
    }
}
