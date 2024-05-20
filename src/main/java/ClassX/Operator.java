package ClassX;

public class Operator {
    public static void main(String[] args) {
        int a = 5, b = 3, c = 1;
        int d = a++ + --b + c++ + b + a + c;
        System.out.println(d);
    }
}
