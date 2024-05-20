package alvia;

public class PatternLetter {
    public static void main(String[] args) {
        for (int i = 'A'; i <='E' ; i++)
        {
            for (int j = 'A'; j <=i ; j++)
            {
                System.out.print((char)j+" ");
            }
            System.out.println();
        }
    }
}
