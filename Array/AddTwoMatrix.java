package Array;

import java.util.Scanner;

public class AddTwoMatrix {

    public static void main(String[] args) {
        try (Scanner as = new Scanner(System.in)) {

            System.out.print("Enter the row of first matrix :");
            int p = as.nextInt();

            System.out.print("Enter the column of first matrix:");
            int q = as.nextInt();

            System.out.print("Enter the row of second matrix:");
            int m = as.nextInt();

            System.out.print("Enter the column of second matrix:");
            int n = as.nextInt();

            // checking matix condition
            if (p == m && q == n) {
                // matrix declaration:
                int a[][] = new int[p][q];
                int b[][] = new int[m][n];
                int c[][] = new int[m][n];
                // taking first matrix from user
                System.out.println("Enter the element of  first matrix: ");
                for (int i = 0; i < p; i++) {
                    for (int j = 0; j < q; j++) {
                        a[i][j] = as.nextInt();
                    }
                }
                System.out.println();

                // taking second matrix from user:
                System.out.println("Enter the element of second matrix:");
                for (int i = 0; i < m; i++) {
                    for (int j = 0; j < n; j++) {
                        b[i][j] = as.nextInt();
                    }
                }
                System.out.println();

                // print first matrix
                System.out.println("First matrix are: ");
                for (int i = 0; i < m; i++) {
                    for (int j = 0; j < n; j++) {
                        System.out.print(a[i][j] + " ");
                    }
                    System.out.println("");
                }

                // print second matrix:
                System.out.println("Second matrix are: ");
                for (int i = 0; i < m; i++) {
                    for (int j = 0; j < n; j++) {
                        System.out.print(b[i][j] + " ");
                    }
                    System.out.println("");
                }

                // apply addition operation
                System.out.println("Sum of these two matrix:");
                for (int i = 0; i < m; i++) {
                    for (int j = 0; j < n; j++) {

                        c[i][j] = a[i][j] + b[i][j];

                    }
                }
                System.out.println();

                // print the sum of the both matrix
                for (int i = 0; i < p; i++) {
                    for (int j = 0; j < q; j++) {
                        System.out.print(c[i][j] + " ");
                    }
                    System.out.println("");
                }
            } else {
                System.out.println("Can not perform addition operation of these matrix:");
                return;
            }
        }
    }
}
