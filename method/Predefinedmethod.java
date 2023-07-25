package method;

import java.util.*;

public class Predefinedmethod {

    // user defined method method

    public int max(int a, int b) {
        // using ternory operator
        int max = (a > b) ? a : b;
        // return the values
        return max;

    }

    // main method is created
    public static void main(String[] args) {
        // Taking input from user
        try (Scanner as = new Scanner(System.in)) {

            System.out.println("enter the any two number:");

            int x = as.nextInt();
            int y = as.nextInt();
            // calling method and print the results

            System.out.println("The maximum number is:" + Math.max(x, y));
        }
    }
}
