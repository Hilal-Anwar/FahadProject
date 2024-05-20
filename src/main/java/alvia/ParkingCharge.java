package alvia;


import java.util.Scanner;

public class ParkingCharge {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number of hours");
        int hr;
        hr = in.nextInt();
        double ch = 0;
        if (hr <= 8)
        {
            ch = hr * 10;
        }
        else if (hr > 8 && hr <= 16)
        {
            ch = 8 * 10 + (hr - 8) * 12;
        }
        else if (hr > 16 && hr <= 24) {
            ch = 8 * 10 + 8 * 12 + (hr - 16) * 16;
        } else {
            ch = 8 * 10 + 8 * 12 + 8 * 16 + (hr - 24) * 20;
        }

        System.out.println("Total charge is = " + ch);

    }
}
