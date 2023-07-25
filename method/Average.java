package method;

import java.util.Scanner;

public class Average {
    // create a method of average
    public double averageOfNumber(double a, double b, double c) {
        return (a + b + c) / 3;
    }

    public static void main(String[] args) {
        try (Scanner as = new Scanner(System.in)) {
            // taking input from user

            System.out.println("Enter the first number:");
            double a = as.nextDouble();

            System.out.println("enter the second number:");
            double b = as.nextDouble();

            System.out.println("Enter the third number:");
            double c = as.nextDouble();

            // creating object for calling the method

            Average xyz = new Average();

            // call the method by object
            System.out.println("The average of three number is: " + xyz.averageOfNumber(a, b, c));
        }

    }
}
