package class8th;

import java.util.Scanner;

public class Electric {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the unit");
        int unit=s.nextInt();
        double charge=0.0;
        if (unit<=100)
            charge=unit*1.25+200;
        else if (unit>=101 && unit<=200)
            charge=unit*2.30+200;
    }
}
