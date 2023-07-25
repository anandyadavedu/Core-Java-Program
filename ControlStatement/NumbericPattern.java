package ControlStatement;

import java.util.*;

public class NumbericPattern {
    public static void main(String[] args) {
        try (Scanner as = new Scanner(System.in)) {

            System.out.print("Enter the row number :");
            int rows = as.nextInt();
            int k = 1;
            // outer loop
            // for define how many rows in the pattern

            for (int i = 1; i <= rows; i++) {

                // inner loop
                // use for print the number in row wise

                for (int j = 1; j <= i; j++) {

                    // using post increment to compute these pattern
                    // first print the origanal value then increment thge value
                    System.out.print(k++ + " ");

                }

                System.out.println();
            }
        }
    }

}
