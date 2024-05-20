package pattern;

public class pattern2 {
    public static void main(String[] args) {
        String[] z = {"B", "L", "U", "E", "J"};
        for (int i = z.length - 1; i >= 0; i--) {
            for (int j = 0; j <= i; j++) {
                System.out.print(z[j] + " ");
            }
            System.out.println();
        }
    }
}
