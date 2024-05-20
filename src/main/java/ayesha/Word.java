package ayesha;

public class Word {
    public static void main(String[] args) {
        for (int i = 1; i <= 20; i++) {
            System.out.println(qu(i, i + 1, i + 2, i + 3));
        }
    }

    static String qu(int a, int b, int c, int d) {
        return (a + b * 3) + "\\sqrt{\\frac{" + a*(b+3) + "}{" + b + "}}"+si(a) +
                "\\sqrt{\\frac{" + c + "}{" + d + "}}" + si(a) +
                "\\sqrt{\\frac{" + (c + a) + "}{" + (b + d) + "}}";
    }

    static String si(int a) {
        return a % 2 == 0 ? "-" + a :  "+"+a;
    }
}
