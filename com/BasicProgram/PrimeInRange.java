package com.BasicProgram;

import java.util.*;

public class PrimeInRange {
    public static void main(String[] args) {
        Scanner as = new Scanner(System.in);
        // Taking lower boundary

        System.out.print("Enter the lower boundary of number:");
        int low = as.nextInt();

        // Taking upper boundary
        System.out.print("Enter the upper boundary of number:");
        int upp = as.nextInt();
        as.close();

        // print statement
        System.out.println("all prime number in bitween " + low + " to " + upp + " ");

        // condition run when low start from zero
        if (low == 1) {
            low += 1;
        }

        // outer loop
        for (int n = low; n <= upp; n++) {
            int count = 0;

            // inner loop
            for (int i = 2; i <= n / 2; i++) {

                int rem = n % i;
                if (rem == 0) {
                    count++;
                    break;
                }
            }

            // Print the prime number
            if (count == 0) {
                System.out.print(n + "  ");
            }
        }
    }

}
