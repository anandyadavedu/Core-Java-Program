package method;

import java.util.*;

public class SmallestNumber {
    // create the method
    public static int smallest(int a, int b, int c) {
        return Math.min(Math.min(a, b), c);
    }

    public static void main(String[] args) {
        try (Scanner as = new Scanner(System.in)) {

            System.out.println("Enter the first number:");
            int a = as.nextInt();
            System.out.println("Enter the second number:");
            int b = as.nextInt();
            System.out.println("Enter the third number:");
            int c = as.nextInt();

            // calling the method
            System.out.println("smallest number is " + smallest(a, b, c) + "\n");
        }
    }

    // public static int smallest(int a, int b, int c) {

    // return Math.min(Math.min(a, b), c);

    // }

}
