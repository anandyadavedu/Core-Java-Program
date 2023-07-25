package com.BasicProgram;

import java.util.*;

public class FebonacciSeries {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {

            // Taking series condition
            System.out.println("Enter the number of the term:");
            int num = sc.nextInt();

            // initialization
            int a = -1, b = 1;

            // applying loop
            for (int i = 0; i < num; i++) {
                int c = a + b;

                // print the febonacci series
                System.out.print(c + " ");

                // swapping the number
                a = b;
                b = c;

            }
        }

    }
}
