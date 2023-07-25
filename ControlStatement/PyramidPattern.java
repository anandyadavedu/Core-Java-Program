package ControlStatement;

import java.util.*;

// define class
public class PyramidPattern {
    // main method call
    public static void main(String[] args) {
        // define scanner class
        Scanner as = new Scanner(System.in);

        // taking user input from Scanner class
        System.out.print("Enter the rowth number: ");
        // define user input datatype
        int rows = as.nextInt();

        // outer loop for rows
        for (int i = 1; i <= rows; i++) {

            // inner1 loop for gap printing:
            for (int j = 1; j <= rows - i; j++) {
                System.out.print(" ");
            }
            // inner2 loop for print astrik
            for (int k = 1; k <= i; k++) {
                System.out.print("* ");
            }
            // for next line
            System.out.println();

        }
        as.close();
    }

}
