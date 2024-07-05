package alvia;

public class Output2 {
    public static void main(String[] args) {
        int s = 0;
        for (int i = 0; i <= 5; i++) {
            s = i <= 3 ? s + i : s - i;
        }
        System.out.println(s);
    }
}
