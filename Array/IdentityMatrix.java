package Array;

import java.util.Scanner;

public class IdentityMatrix {
    public static void main(String[] args) {
        try (Scanner as = new Scanner(System.in)) {

            System.out.println("Enter the row of matrix:");
            int m = as.nextInt();

            System.out.println("Enter the column of matrix:");
            int n = as.nextInt();
            boolean anand = true;
            if (m == n) {
                int a[][] = new int[m][n];
                System.out.println("Enter the element of matrix:");
                for (int i = 0; i < m; i++) {
                    for (int j = 0; j < n; j++) {
                        a[i][j] = as.nextInt();
                    }
                }
                System.out.println("matrix are: ");
                for (int i = 0; i < m; i++) {
                    for (int j = 0; j < n; j++) {
                        System.out.print(a[i][j] + " ");
                    }
                    System.out.println();
                }

                for (int i = 0; i < m; i++) {
                    for (int j = 0; j < n; j++) {
                        if (i != j && a[i][j] != 0) {
                            anand = false;
                            break;

                        }
                        if (i == j && a[i][j] != 1) {
                            anand = false;
                            break;
                        }

                    }

                }

                if (anand) {
                    System.out.println("Given Matrix are IDENTITY MATRIX:");
                } else {
                    System.out.println("Given matrix are not identity matrix");
                }
            } else {
                System.out.println("Given matrix are not identity:");
            }
        }

    }
}
