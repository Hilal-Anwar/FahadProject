package faizan;

public class SwitchCaseEven {
    public static void main(String[] args) {
        int n = 175;
        int r = n % 2;
        switch (r)
        {
            case 0:
                System.out.println("Even");
                break;
            default:
                System.out.println("Odd number");
        }
    }
}
