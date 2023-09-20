package org.graded.classes.util;

import org.graded.classes.core.Rectangle;

import static org.graded.classes.util.Graded.*;

//import static org.graded.classes.util.Graded.*;
public class Fun {
    public static void main(String[] args) {
        //Graded g = new Graded();//instance of a class or object of a class
        System.out.println("Hello world!");
        print();
        print1("hello my name is helal");
        int n = 4, r = 2;
        int rt = fac(n) / (fac(n - r) * fac(r));
        System.out.println(rt);
        System.out.println(sum(5,9));
        Rectangle re=new Rectangle(6,7.0f);
        System.out.println(re.perimeter());
        System.out.println(re.diagonal());
    }
}
