package Array;

public class SumOfEachRowAndColumn {
    public static void main(String[] args) {
        int a[][] = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };

        System.out.println("Original matrix are: ");
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[0].length; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("Sum of the row of the matrix");
        for (int i = 0; i < a.length; i++) {
            int sum = 0;
            for (int j = 0; j < a[0].length; j++) {
                sum = sum + a[i][j];

            }
            System.out.println("Sum of " + (i + 1) + "row : " + sum);
        }
        System.out.println("Sum of column of matrix: ");
        // calculate the sum of column
        for (int i = 0; i < a[0].length; i++) {
            int sum = 0;
            for (int j = 0; j < a.length; j++) {
                sum = sum + a[j][i];
            }
            System.out.println("Sum of " + (i + 1) + " column : " + sum);
        }

    }

}
