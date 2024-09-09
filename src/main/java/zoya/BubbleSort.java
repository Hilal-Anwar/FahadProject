package zoya;

public class BubbleSort {
    public static void main(String[] args) {
        int[] a = {9, 12, 15, 16, 18, -5, -5, 6, 97, 20};
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 9; j++) {
                if (a[j + 1] < a[j]) {
                    int temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                }
            }
        }
        System.out.print("[");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + ",");
        }
        System.out.println("]");
    }
}
