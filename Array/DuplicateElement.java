package Array;

import java.util.Scanner;

public class DuplicateElement {
    public static void main(String[] args) {
        try (Scanner as = new Scanner(System.in)) {

            System.out.println("Enter the length of array:");
            int n = as.nextInt();

            // declare array
            int arr[] = new int[n];
            System.out.println("Enter the element of array: ");

            // print the original array
            for (int i = 0; i < n; i++) {
                arr[i] = as.nextInt();

            }
            System.out.println("duplicate element are :  >>");
            int anand = -2;

            // checking duplicate condition
            for (int i = 0; i < n; i++) {

                for (int j = i + 1; j < n; j++) {

                    if (arr[i] == arr[j]) {

                        System.out.println(arr[i]);
                        arr[i] = anand;

                    }
                }
            }
            System.out.println();
            // removing the duplicate array element
            System.out.println("After removing duplicate element are: ");
            for (int i = 0; i < n; i++) {
                if (arr[i] > 0) {
                    System.out.println(arr[i]);
                }
            }

        }
    }

}
