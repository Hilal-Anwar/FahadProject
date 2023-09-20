package org.graded.classes.core;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Figure {
    public static void main(String[] args) {
        int a=46,b=46;
        Integer x=24;
        System.out.println(a==b);
        int we[]={3,4,5};
        int wr[]={3,4,5};
        System.out.println(Arrays.equals(we,wr));
        Rectangle rectangle=new Rectangle(9.0,9.0);
        rectangle.draw();
        System.out.println(rectangle.perimeter());
        Rectangle rectangle1=new Rectangle(15.0,9.0);
        System.out.println(rectangle1);
        rectangle1.draw();
        System.out.println(rectangle==rectangle1);
    }
}
