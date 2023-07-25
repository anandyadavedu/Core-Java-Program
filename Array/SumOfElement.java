package Array;

import java.util.Scanner;

public class SumOfElement {
    public static void main(String[] args) {
        try (Scanner as = new Scanner(System.in)) {

            System.out.print("Enter the length of array: ");
            int n = as.nextInt();

            int arr[] = new int[n];
            System.out.println("Enter the element of array:");

            for (int i = 0; i < n; i++) {
                arr[i] = as.nextInt();
            }

            int sum = 0;
            for (int i = 0; i < n; i++) {

                sum = sum + arr[i];

            }
            System.out.println("Sum of all element of array are: " + sum);
        }
    }

}
