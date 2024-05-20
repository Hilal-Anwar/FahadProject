package something;

import java.util.*;

public class SumOf {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a two numbers");
        int a, b;
        a = in.nextInt();
        b = in.nextInt();
        System.out.println("Enter + to add");
        System.out.println("Enter - to sub");
        System.out.println("Enter / to divide");
        System.out.println("Enter * to multiply");
        System.out.println("enter your choice");
        char c = in.next().charAt(0);
        switch (c)
        {
            case '+':
                System.out.println(a + b);
                break;
            case '-':
                System.out.println(a - b);
                break;
            case '*':
                System.out.println(a * b);
                break;
            case '/':
                System.out.println(a / b);
                break;
            default:
                System.out.println("Invalid Input");
        }


    }
}
