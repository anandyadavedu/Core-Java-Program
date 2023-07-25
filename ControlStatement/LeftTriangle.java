
package ControlStatement;

import java.util.Scanner;

public class LeftTriangle {
    public static void main(String[] args) {

        // scanner class for user input
        try (Scanner as = new Scanner(System.in)) {

            System.out.print("Enter the row number :");
            int rows = as.nextInt();

            // outer loop -->>for rows
            for (int i = 1; i <= rows; i++) {

                // inner loop -->>for print space
                for (int j = 1; j <= rows - i; j++) {
                    System.out.print(" ");

                }

                // inner loop for print the pattern
                for (int k = 1; k <= i; k++) {
                    System.out.print("*");
                }

                // for next line
                System.out.println();

            }
        }
    }

}
