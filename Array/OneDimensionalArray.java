package Array;

import java.util.Scanner;

public class OneDimensionalArray {
    public static void main(String[] args) {
        try (Scanner as = new Scanner(System.in)) {

            System.out.println("Enter the length of array:");
            int n = as.nextInt();

            // Array declaration
            int arr[] = new int[n];

            // taking user input of aaray element
            System.out.println("Enter the element of the array:");

            for (int i = 0; i < n; i++) {
                arr[i] = as.nextInt();
            }

            System.out.println("Element in the array are:");

            for (int i = 0; i < n; i++) {

                System.out.print(arr[i] + " ");
            }
        }
    }

}
