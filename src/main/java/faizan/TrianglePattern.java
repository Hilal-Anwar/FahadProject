package faizan;

public class TrianglePattern {
    public static void main(String[] args)
    {
        for (int i = 'E'; i >= 'A'; i--)
        {
            for (int j = 'A'; j <= i; j++)
            {
                System.out.print((char) j + " ");
            }
            System.out.println();
        }
    }
}
