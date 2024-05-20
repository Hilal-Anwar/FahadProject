package alvia;

public class Pattern12 {
    public static void main(String[] args) {
        for (int i = 9; i >= 1; i = i - 2)
        {
            for (int j = i; j <= 9; j = j + 2)
            {
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}
