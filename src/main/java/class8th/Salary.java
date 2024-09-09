package class8th;

import java.util.Scanner;

public class Salary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the basic salary: ");
        double basicSalary = sc.nextDouble();
        double hra, da, gs, tax;
        hra = basicSalary * 5 / 100.0;
        da = basicSalary * 10 / 100.0;
        gs = basicSalary + hra + da;
        System.out.println("The gross salary is: " + gs);
        if (gs * 12 > 1000000)
            tax = (gs ) * 15 / 100.0;
        else
            tax = (gs ) * 5 / 100.0;
        System.out.println("The tax is: " + tax);
        System.out.println("Salary after tax = "+(gs-tax));
    }
}
