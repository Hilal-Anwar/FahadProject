package class11th;

import java.util.Arrays;

public class Set {
    public static void main(String[] args) {
        int []a = {7, 1, -8, 5, 6, 4, 7, 1, -8};

        System.out.println(Arrays.toString(a));
        int[] b = new int[a.length];
        int k = 1;
        b[0] = a[0];
        for (int i = 1; i < a.length; i++) {
            if (b[k - 1] != a[i]) {
                b[k] = a[i];
                k++;
            }
        }
        System.out.println(Arrays.toString(b));
    }
}
