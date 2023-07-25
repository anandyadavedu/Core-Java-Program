package ControlStatement;

import java.util.*;

public class DiamondShape {
    public static void main(String[] args) {

        // Scanner class for user input
        try (Scanner as = new Scanner(System.in)) {

            System.out.print("Enter the row number: ");
            int rows = as.nextInt();
            // if rows are even then diamond form does not formed
            if (rows % 2 == 1) {
                System.out.println("The diamond shape of " + rows + " th rows are :");

                int temp = rows / 2 + 1;

                // code for upper diamond(triangle) structure
                // outer loop for rows defining
                for (int i = 1; i <= temp; i++) {

                    // for space define in bitween Astric
                    for (int j = 1; j <= temp - i; j++) {
                        System.out.print(" ");
                    }

                    // inner most loop for print Astric Symbol
                    for (int k = 1; k <= 2 * i - 1; k++) {
                        System.out.print("*");
                    }
                    // for next line print
                    System.out.println();
                }

                // code for lower triangle form in diamond shape
                // upper loop for rows
                for (int i = 1; i <= temp - 1; i++) {

                    // loop for space
                    for (int j = 1; j <= i; j++) {
                        System.out.print(" ");
                    }

                    // inner loop for Astric Symbol print
                    for (int k = 1; k <= (rows - (2 * i)); k++) {
                        System.out.print("*");
                    }
                    System.out.println();

                }

            }

            else {
                System.out.print("Does not form of diamond shape in even rows number ");
            }

        }
    }

}
