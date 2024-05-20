package pattern;

public class pattern3 {
    public static void main(String[] args) {
        String[] z = {"A", "B", "C", "D", "E"};
        for (int i = z.length - 1; i >= 0; i--) {
            for (int j = 0; j <= i; j++) {
                System.out.print(z[j] + " ");
            }
            System.out.println();
        }
    }
}