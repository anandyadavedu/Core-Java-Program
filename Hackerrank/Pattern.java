
import java.util.*;

public class Pattern {
    public static void main(String[] args) {
        Scanner as = new Scanner(System.in);

        System.out.println("Enter the rows number:");
        int rows = as.nextInt();
        as.close();

        for (int i = 1; i <= rows; i++) {
            for (int k = 1; k <= rows - i; k++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= 2 * rows - 1; j++) {
                if (i == 1 && j == rows) {
                    System.out.print(i);
                    break;
                } else if (i < rows && (j == rows - (i - 1) || j == rows + (i + 1))) {
                    if (i != 1) {
                        System.out.print(i);
                    }

                } else if (i == rows) {
                    System.out.print(i);

                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

    }
}
