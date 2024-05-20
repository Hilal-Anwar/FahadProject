package alvia;

import java.util.*;

class Parameter {
    void prime(int n)
    {
        int c=0;
        for (int i = 1; i <=n ; i++) {
            if (n%i==0)
                c++;
        }
        if (c==2)
            System.out.println("Numbers is prime");
        else
            System.out.println("Number is composite");
    }
    public static void main(String[] args) {
        Parameter obj=new Parameter();
        Scanner in=new Scanner(System.in);
        System.out.println("Enter 3 numbers");
        int m,n,o;
        m=in.nextInt();
        n=in.nextInt();
        o=in.nextInt();
        obj.prime(m);
        obj.prime(n);
        obj.prime(o);
    }

}
