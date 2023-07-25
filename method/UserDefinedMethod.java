package method;

import java.util.*;

//Program for calling method without creating object
//User defined methods
public class UserDefinedMethod {
    public static String EvenOdd(int num) {
        if (num % 2 == 0) {
            // System.out.println("Even Number");
            return "Enter Number > " + num + " is Even";
        } else {
            // System.out.println("Odd Number");
            return "Enetr Numbe > " + num + " is Odd";
        }

    }

    public static void main(String[] args) {
        try (Scanner as = new Scanner(System.in)) {

            System.out.println("Enter the number :");
            int num = as.nextInt();

            System.out.println(EvenOdd(num));
        }
    }

}
