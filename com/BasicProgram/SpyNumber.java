package com.BasicProgram;

import java.util.*;

// checking Spy number 
// sum of all digit equal to product of all digit
public class SpyNumber {
    public static void main(String[] args) {
        Scanner as = new Scanner(System.in);

        System.out.print("Enter the any integer number:");
        int num = as.nextInt();
        as.close();

        // initialization
        int sum = 0, product = 1;
        int temp = num;
        // using condition to produce sum and product
        while (num > 0) {
            int rem = num % 10;
            sum = sum + rem;
            product = product * rem;
            num = num / 10;
        }
        // checking spy number condition
        if (sum == product) {
            System.out.println(temp + "  Is a Spy Number ");
        } else {
            System.out.println(temp + "  IS NOT a Spy Number:");
        }
    }

}
