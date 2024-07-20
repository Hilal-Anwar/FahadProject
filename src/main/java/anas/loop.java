package anas;

public class loop {
    public static void main(String[] args) {
        for (int i = 1; i <= 12; i++) {
            if (i % 6 == 0)
                continue;
            else
                System.out.println(i);
        }
    }
}
