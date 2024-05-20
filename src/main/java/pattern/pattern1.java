package pattern;

public class pattern1 {
    public static void main(String[] args) {
        String[] z = {"J", "A", "V", "A"};
        for (int i = z.length - 1; i >= 0; i--) {
            for (int j = 0; j <= i; j++) {
                System.out.print(z[j] + " ");
            }
            System.out.println();
        }
    }
}
