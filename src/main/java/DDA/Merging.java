package DDA;

public class Merging {
    public static void main(String[] args) {
        int a[] = {5, 9, 12, 13, 25};
        int b[] = {8, 45, 56, 87, -54, 21, 1, 78, 2121, 878, 87};
        int c[] = new int[a.length + b.length];
        for (int i = 0; i < a.length; i++) {
            c[i]=a[i];
        }
        for (int i = 0; i < b.length; i++) {
                c[a.length+i]=b[i];
        }
        for (int i = 0; i < c.length; i++) {
            System.out.println(c[i]);
        }

    }
}
