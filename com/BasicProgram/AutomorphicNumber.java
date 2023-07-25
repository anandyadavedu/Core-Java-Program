package com.BasicProgram;

import java.util.Scanner;

// A number whose square end with the number

public class AutomorphicNumber {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {

            System.out.println("Enter the any integer number: ");
            int num = sc.nextInt();

            int count = 0;
            int temp = num;

            while (temp > 0) {
                count++;
                temp = temp / 10;
            }

            int sqr = num * num;
            int rem = (int) (sqr % (Math.pow(10, count)));

            if (num == rem) {
                System.out.println("Automorphic Number:");
            } else {
                System.out.println("NOT Automorphic Number:");
            }

        }

    }

}
