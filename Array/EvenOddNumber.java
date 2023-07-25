package Array;

import java.util.Scanner;

public class EvenOddNumber {
    public static void main(String[] args) {
        try (Scanner as = new Scanner(System.in)) {

            System.out.println("Enter the row of matrix");
            int m = as.nextInt();

            System.out.println("Enter the column of matrix");
            int n = as.nextInt();

            int a[][] = new int[m][n];
            System.out.println("Enter the element of matrix:");
            for (int i = 0; i < m; i++) {
                for (int j = 0; j < n; j++) {
                    a[i][j] = as.nextInt();

                }
            }
            System.out.println("Matrix are: ");
            for (int i = 0; i < m; i++) {
                for (int j = 0; j < n; j++) {
                    System.out.print(a[i][j] + " ");
                }
                System.out.println();

            }
            System.out.println();

            System.out.print("Even number in matrix are: ");
            for (int i = 0; i < m; i++) {
                for (int j = 0; j < n; j++) {
                    if (a[i][j] % 2 == 0) {

                        System.out.print(a[i][j] + " ");
                    }

                }

            }
            System.out.println();
            System.out.println("odd number in matrix are: ");
            for (int i = 0; i < m; i++) {
                for (int j = 0; j < n; j++) {
                    if (a[i][j] % 2 == 1) {
                        System.out.print(a[i][j] + " ");
                    }
                }
            }
        }

    }

}
