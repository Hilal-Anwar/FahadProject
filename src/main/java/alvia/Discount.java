package alvia;

import javax.sound.sampled.AudioSystem;
import java.util.Scanner;

public class Discount {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double sp, amt;
        System.out.println("Enter the cost price");
        sp = in.nextInt();
        if (sp <= 2000)
            amt = (1 - 5.0 / 100) * sp;
        else if (sp > 2000 && sp <= 5000)
            amt = (1 - 10.0 / 100) * sp;
        else if (sp > 5000 && sp <= 10000)
            amt = (1 - 15.0 / 100) * sp;
        else
            amt = (1 - 20.0 / 100) * sp;
        System.out.println("Amount to paid is = "+amt);
    }
}
