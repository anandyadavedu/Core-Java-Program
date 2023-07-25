package Recursion;

import java.util.Scanner;

public class Foactorial {
    public static int calcFact(int n) {
        if (n == 1 || n == 0) {
            return 1;
        }
        int fact_nm1 = calcFact(n - 1);
        int fact_n = n * fact_nm1;
        return fact_n;
    }

    public static void main(String[] args) {
        Scanner as = new Scanner(System.in);

        System.out.println("Enter the number ");
        int n = as.nextInt();
        as.close();

        int fact = calcFact(n);
        System.out.println("Factorial of the number is: " + fact);
    }

}
