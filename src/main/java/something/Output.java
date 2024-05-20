package something;

public class Output {
    public static void main(String[] args) {
        int a = 7, b = 12, c = 3;
        for (int i = 0; i <= 5; i++) {
            c += ++a + b - a++ - --b;
        }
        System.out.println(c);
    }
}

