package ControlStatement;

import java.util.*;

public class DownwordTriangle {
    public static void main(String[] args) {
        try (Scanner as = new Scanner(System.in)) {

            System.out.print("Enter the number of rows:");
            int rows = as.nextInt();

            for (int i = 1; i <= rows; i++) {

                for (int j = 1; j <= rows - i + 1; j++) {

                    System.out.print("*");

                }

                System.out.println();
            }
        }
    }

}
