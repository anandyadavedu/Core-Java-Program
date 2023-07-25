package Array;

public class LowerTriangleMatrix {
    public static void main(String[] args) {
        int a[][] = { { 1, 2, 3 }, { 3, 2, 1 }, { 4, 5, 6 } };

        System.out.println("Original matrix are: ");
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[0].length; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("Lower triangle are: ");
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[0].length; j++) {
                if (i < j) {
                    a[i][j] = 0;
                    System.out.print(a[i][j] + " ");
                } else {
                    System.out.print(a[i][j] + " ");

                }

            }
            System.out.println();

        }

    }

}
