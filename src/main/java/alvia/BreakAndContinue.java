package alvia;

public class BreakAndContinue {
    public static void main(String[] args) {
        int i;
        for (i = 1; i <= 5; i++) {
            if (i == 3) {
                continue;
            } else {
                System.out.println(i);
            }

        }
    }
}
