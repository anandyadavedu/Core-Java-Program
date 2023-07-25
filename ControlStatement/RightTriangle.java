package ControlStatement;

import java.util.*;

// class defined
public class RightTriangle {
    // main method is defined
    public static void main(String[] args) {
        // defined scanner class for user input
        try (Scanner as = new Scanner(System.in)) {

            System.out.print("Enter the row number :");
            int rows = as.nextInt();
            // outer loop for rows
            for (int i = 1; i <= rows; i++) {
                // inner loop
                for (int j = 1; j <= i; j++) {
                    System.out.print("*");

                }
                System.out.println();

            }
        }
    }

}
