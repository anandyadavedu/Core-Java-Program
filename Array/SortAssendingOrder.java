package Array;

import java.util.Scanner;

public class SortAssendingOrder {
    public static void main(String[] args) {
        try (Scanner as = new Scanner(System.in)) {

            System.out.println("Enter the length of array:");
            int n = as.nextInt();

            System.out.println("Enter the element of array: ");
            int arr[] = new int[n];

            for (int i = 0; i < n; i++) {
                arr[i] = as.nextInt();
            }
            // sorting code
            int temp = 0;
            for (int i = 0; i < n; i++) {
                for (int j = i + 1; j < n; j++) {
                    if (arr[i] >= arr[j]) {
                        temp = arr[i];
                        arr[i] = arr[j];
                        arr[j] = temp;
                    }
                }
            }
            System.out.println();

            System.out.println("Sorted array are: ");
            for (int i = 0; i < n; i++) {
                System.out.print(arr[i] + " ");
            }
        }
    }

}
