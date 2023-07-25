package Array;

import java.util.Scanner;

public class TransposeMatrix {
    public static void main(String[] args) {
        try (Scanner as = new Scanner(System.in)) {

            System.out.println("Enter the row of matrix:");
            int m = as.nextInt();

            System.out.println("Enter the column of matrix:");
            int n = as.nextInt();

            int a[][] = new int[m][n];
            // int b[][] = new int[n][m];

            System.out.println("Enter the element of matrix:");
            for (int i = 0; i < m; i++) {
                for (int j = 0; j < n; j++) {
                    a[i][j] = as.nextInt();
                }

            }
            System.out.println();
            System.out.println("Original matrix are: ");
            for (int i = 0; i < m; i++) {
                for (int j = 0; j < n; j++) {
                    System.out.print(a[i][j] + " ");

                }
                System.out.println();
            }
            System.out.println();
            System.out.println("The transpose matrix are: ");

            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    System.out.print(a[j][i] + " ");

                }
                System.out.println();
            }
        }

    }

}
