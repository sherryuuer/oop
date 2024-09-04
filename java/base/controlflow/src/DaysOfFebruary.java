package controlflow.src;

import java.util.Scanner;

public class DaysOfFebruary {
    public static void main(String[] args) {
        int daysOfFebruary = 28;

        Scanner input = new Scanner(System.in);

        System.out.println("Input the year: ");
        int year = input.nextInt();

        if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
            daysOfFebruary++;
        }
        System.out.println(year + " has " + daysOfFebruary + " days in February.");
        input.close();
    }
}
