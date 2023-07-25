package ControlStatement;

import java.util.*;

public class RightPascaltriangle {
    public static void main(String[] args) {
        try (Scanner as = new Scanner(System.in)) {

            System.out.print("Enter the row number ");
            int rows = as.nextInt();
            int temp = rows / 2 + 1, i;

            for (i = 1; i <= temp; i++) {
                for (int j = 1; j <= i; j++) {
                    System.out.print("*");
                }
                System.out.println();

            }
            for (i = 1; i <= temp - 1; i++) {
                for (int j = 1; j <= temp - i; j++) {
                    System.out.print("*");
                }
                System.out.println();
            }

        }
    }
}
