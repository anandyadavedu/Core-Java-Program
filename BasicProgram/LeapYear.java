package BasicProgram;

import java.util.*;

public class LeapYear {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {

            // taking input as a year
            System.out.println("Enter the year:");
            int x = sc.nextInt();

            // checking condition
            if (x % 4 == 0 || x % 100 == 0) {
                System.out.println("Year " + x + " is LEAP YEAR:");
            } else {
                System.out.println("Year is NOT LEAP YEAR:");
            }
        }

    }

}
