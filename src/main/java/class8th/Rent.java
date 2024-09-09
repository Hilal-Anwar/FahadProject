package class8th;

import java.util.Scanner;

/*
53.	Write a program to input the number of days and calculate the rent for a car on the following basis.
First five days	Rs 500 per day
Next five days	Rs 400 per day
Rest of the days	Rs 200 per day

 */
public class Rent {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter No, of days");
        int days = sc.nextInt();
        double charge = 0.0;
        if (days <= 5)
            charge = 500 * days;
        else if (days > 5 && days <= 10)
            charge = 5 * 500 + (days - 5) * 400;
        else
            charge = 5 * 500 + 400 * 5 + (days - 5) * 200;
        System.out.println(charge);


    }
}
