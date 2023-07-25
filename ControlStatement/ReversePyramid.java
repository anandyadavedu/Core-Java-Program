package ControlStatement;

import java.util.*;

public class ReversePyramid {
    public static void main(String[] args) {
        try (Scanner as = new Scanner(System.in)) {

            System.out.print("Enter the row number :");
            int rows = as.nextInt();

            for (int i = 1; i <= rows; i++) {
                for (int j = 1; j <= i - 1; j++) {
                    System.out.print(" ");
                }
                for (int k = 1; k <= rows - i + 1; k++) {
                    System.out.print("* ");

                }
                System.out.println();

            }
        }
    }

}
