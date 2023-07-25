package ControlStatement;

import java.util.*;

public class SimpleNumericPattern {
    public static void main(String[] args) {
        try (Scanner as = new Scanner(System.in)) {

            System.out.print("Enter the row number :");
            int rows = as.nextInt();

            for (int i = 1; i <= rows; i++) {

                for (int j = 1; j <= i; j++) {

                    System.out.print(j);
                }

                System.out.println();
            }

        }
    }

}
