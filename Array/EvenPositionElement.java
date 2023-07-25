package Array;

import java.util.Scanner;

public class EvenPositionElement {
    public static void main(String[] args) {
        try (Scanner as = new Scanner(System.in)) {

            System.out.println("Enter the length of array:");
            int n = as.nextInt();

            // array declare
            int arr[] = new int[n];

            // print the original array
            System.out.println("Array element are:");
            for (int i = 0; i < n; i++) {
                arr[i] = as.nextInt();

            }
            // for space bitween original array and even position element:
            System.out.println();

            // apply even position condition
            for (int i = 0; i < n; i++) {
                if (i % 2 == 1) {
                    System.out.println("Even position's element are: " + arr[i]);
                }
            }
        }
    }

}
