package Array;

import java.util.Scanner;

public class MultiplyTwoMatrix {
    public static void main(String[] args) {
        try (Scanner as = new Scanner(System.in)) {

            System.out.print("Enter the row number in first matrix:");
            int m = as.nextInt();

            System.out.print("Enter the column of first matrix:");
            int n = as.nextInt();

            System.out.print("Enter the row of second matrix:");
            int p = as.nextInt();

            System.out.print("Enter the column of second matrix:");
            int q = as.nextInt();

            // matrix multiplication condition
            if (n == p) {
                // declaration of matrices
                int a[][] = new int[m][n];
                int b[][] = new int[p][q];
                int c[][] = new int[m][q];

                // taking element of first matrix from user
                System.out.println("Enter the element of first matrix:");
                for (int i = 0; i < m; i++) {
                    for (int j = 0; j < n; j++) {
                        a[i][j] = as.nextInt();
                    }

                }
                // taking element of second matrix from user
                System.out.println("Enter the scond matrix element:");
                for (int i = 0; i < p; i++) {
                    for (int j = 0; j < q; j++) {
                        b[i][j] = as.nextInt();
                    }

                }
                // print first matrix
                System.out.println("first matrix are:");
                for (int i = 0; i < m; i++) {
                    for (int j = 0; j < n; j++) {
                        System.out.print(a[i][j] + "  ");
                    }
                    System.out.println();
                }
                // print the second matrix
                System.out.println("second matrix are:");
                for (int i = 0; i < p; i++) {
                    for (int j = 0; j < q; j++) {
                        System.out.print(b[i][j] + "  ");
                    }
                    System.out.println();
                }
                // print multiplicative matrix
                System.out.println("After multiplication matrix are:");
                // loop for row of multiplicative matrix
                for (int i = 0; i < m; i++) {
                    // loop for column
                    for (int j = 0; j < q; j++) {
                        c[i][j] = 0;
                        // for print the matrix loop is gone untill column of first or row of second
                        // matrix
                        for (int k = 0; k < n; k++) {
                            c[i][j] += a[i][k] * b[k][j];
                        }
                        // print the final matrix
                        System.out.print(c[i][j] + "  ");

                    }
                    // for next line
                    System.out.println();
                }

            }
        }

    }

}
