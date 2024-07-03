package alvia;

public class Output1 {
    public static void main(String[] args) {
        int i = 1;
        while (i <= 5)
        {
            if (i % 3 == 0)
            {
                System.out.println(i);
                i=i+2;
            }
            else
            {
                i = i + 1;
            }
        }
    }
}
