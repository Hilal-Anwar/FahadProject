package something;

import java.util.*;

class twinprime {
    static int Prime(int a) {
        int f = 0;
        int count = 0;
        for (int i = 1; a >= i; i++) {
            if (a % i == 0)
                count++;
        }
        if (count == 2) {
            f = 1;
        }
        return f;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a,b,v=0;
        for (int i = 1; i <=10000 ; i++) {
            a = i;
            b = i + 2;
            if (Prime(a) == 1 && Prime(b) == 1 && Math.abs(a - b) == 2)
                v+=1;
        }
        System.out.println(v);
    }
}