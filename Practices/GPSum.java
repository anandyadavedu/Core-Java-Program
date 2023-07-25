package Practices;

import java.util.*;

public class GPSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number");
        int n = sc.nextInt();
        sc.close();

        for (int i = 0; i < n; i++) {
            int N = 0;
            for (int j = n - i; j > 0; j--) {
                System.out.print(++N);
            }
            System.out.println();

        }
    }

}
