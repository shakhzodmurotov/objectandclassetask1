

import Rectngle.Rectngle;

import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the length of the Rectangle");
        double length = scan.nextDouble();
        System.out.println("Enter the width of the Rechtangle");
        double width = scan.nextDouble();
        Rectngle rect = new Rectngle(length,width);
        double area = rect.calculateArea();
        System.out.println("The area of the rectangle is: " +area);


    }
}