package BasicProgram;

import java.util.*;

// prime number checking program
public class PrimeNumber {
    public static void main(String[] args) {
        try (Scanner as = new Scanner(System.in)) {
            // taking input from user
            System.out.println("Enter the any integer number:");
            int num = as.nextInt();
            // initialization
            int count = 0;
            // apply loop to check palindrome condition
            for (int i = 2; i <= num / 2; i++) {
                int rem = num % i;
                if (rem == 0) {
                    count++;
                    break;
                }

            }
            if (count == 0) {
                System.out.println("NUMBER " + num + " PRIME ");

            } else {
                System.out.println("NUMBER " + num + " NOT PRIME");
            }
        }
    }

}
