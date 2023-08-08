package Recursion;

import java.util.Scanner;

public class Febonocci {
    public static void feboNumber(int a, int b, int n) {
        if (n == 0) {
            return;
        }

        int c = a + b;
        System.out.print(c + " ");
        feboNumber(b, c, n - 1);
    }

    public static void main(String[] args) {
        int a = 0, b = 1;

        Scanner as = new Scanner(System.in);

        System.out.println("Enter the number: ");
        int n = as.nextInt();
        as.close();
        System.out.println("Febonacci series of " + n + "th term number are:  ");
        System.out.print(a + " " + b + " ");

        feboNumber(a, b, n - 2);

    }
}
