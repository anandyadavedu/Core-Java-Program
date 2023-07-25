package com.BasicProgram;

import java.util.*;

public class EmployeeStatus {
    public static void main(String[] args) {
        // taking user input
        try (Scanner sc = new Scanner(System.in)) {
            // taking age as a input
            System.out.println("Enter the age:");
            int age = sc.nextInt();
            // taking sex as a input
            System.out.println("Enter the sex of employee M/F:");
            char sex = sc.next().charAt(0);
            // taking merital status
            System.out.println("Enter the merital status Y/N");
            char married = sc.next().charAt(0);

            System.out.println("age:" + age);
            System.out.println("sex:" + sex);
            System.out.println("married:" + married);
            // apply condition
            if (sex == 'F') {
                System.out.println("Work in only urban areas:");
            } else if (sex == 'M' && age >= 20 && age < 40) {
                System.out.println("work anywhere:");

            } else if (sex == 'm' && age >= 40 && age < 60) {
                System.out.println("Work only urban area:");
            } else {
                System.out.println("ERROR:");
            }
        }

    }

}
