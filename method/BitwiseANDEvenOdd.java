package method;

import java.util.Scanner;

public class BitwiseANDEvenOdd {
    public static void evenOdd(int num) {
        if ((num & 1) == 0) {
            System.out.print("Enter Number " + num + " is Even");
        } else {
            System.out.print("Enter Number " + num + " is Odd");
        }

    }

    public static void main(String[] args) {
        try (Scanner as = new Scanner(System.in)) {

            System.out.print("Enter the number:");
            int x = as.nextInt();

            evenOdd(x);
        }

    }
}
