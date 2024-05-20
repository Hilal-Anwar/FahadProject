package something;

import java.util.Arrays;

public class Binary {
    public static void main(String[] args) {
        String[] a = {"Alina", "Atifa", "Arman", "Arham", "Arpita", "Adil", "Atif", "Arpit"};
        Arrays.sort(a);
        System.out.println(Arrays.toString(a));
        int lb = 0, ub = a.length - 1;
        int mid = 0;
        String n = "Alina";
        int c = 0;
        while (lb <= ub) {
            mid = (lb + ub) / 2;
            if (a[mid].equals(n)) {
                c = 1;
                break;
            } else if (a[mid].compareTo(n) < 0)
                lb = mid + 1;
            else if (a[mid].compareTo(n) > 0)
                ub = mid - 1;
        }
        if (c == 1)
            System.out.println("Element " + a[mid] + " is found at " + (mid + 1));
        else System.out.println("Element was not found");

    }
}
