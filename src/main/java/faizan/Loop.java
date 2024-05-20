package faizan;

public class Loop {
    public static void main(String[] args) {
        int y = 8;
        int u = y + ++y + y-- + --y;

        System.out.println(u);
        System.out.println(y);
    }
}
