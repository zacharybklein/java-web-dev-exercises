package exercises;

import java.util.Scanner;

public class MilesDriven {
    public static void main(String[] args) {
        double miles;
        double gallons;
        double mpg;
        Scanner input;

        input = new Scanner(System.in);
        System.out.println("How many miles did you drive?");
        miles = input.nextDouble();
        System.out.println("How many gallons of gas did you consume?");
        gallons = input.nextDouble();
        input.close();

        mpg = miles / gallons;
        System.out.println("Your vehicle gets approx. " + mpg + " miles to the gallon");

    }
}
