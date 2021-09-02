package exercises;
import java.util.Scanner;

public class RectangleClass {
    public static void main(String[] args) {
        double length;
        double width;
        double area;
        Scanner input;

        input = new Scanner(System.in);
        System.out.println("Enter the length of the triangle (in inches): ");
        length = input.nextDouble();
        System.out.println("Enter the width of the triangle (in inches): ");
        width = input.nextDouble();
        input.close();

        area = length * width;
        System.out.println("The area of your rectangle is: " + area + " inches");

    }
}
