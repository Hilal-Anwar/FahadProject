package class11th;

import java.util.Arrays;

public class Set1 {
    public static void main(String[] args) {
        int[] a = {7, 1, -8, 5, 6, 4, 7, 1, -8};
        int[] b = new int[a.length];
        int k = 0;
        for (int i = 0; i < a.length; i++) {
            int c = 0;
            for (int j = 0; j <= k; j++) {
                if (a[i] == b[j])
                    c = 1;
            }
            if (c != 1) {
                b[k] = a[i];
                k++;
            }

        }
        System.out.println(Arrays.toString(b));
    }
}
