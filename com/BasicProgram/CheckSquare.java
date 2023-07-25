package com.BasicProgram;

import java.util.Scanner;

public class CheckSquare {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            // taking length from user
            System.out.println("Enter length:");
            int x = sc.nextInt();
            // taking width from user
            System.out.println("enter width:");
            int y = sc.nextInt();
            if (x == y) {
                // int d1 = x * x + y * y;
                System.out.println("The rectangle is Square:");

            } else {
                System.out.println("The Ractangle is NOT Square:");
            }
        }

    }

}
