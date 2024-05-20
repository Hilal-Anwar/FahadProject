package pattern;


public class pattern4 {
    public static void main(String[] args) {
        char[] z = {'A', 'B', 'C', 'D', 'E'};
        for (int i = z.length - 1; i >= 0; i--) {
            int k=i;
            for (int j = 0; j <= i; j++) {
                if (k % 2 == 0)
                    System.out.print(Character.toLowerCase(z[j])+" ");
                else
                    System.out.print(z[j]+" ");
                k++;
            }
            System.out.println();
        }
    }
}