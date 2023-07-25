package Array;

import java.util.Scanner;

public class ThirdLargestNumber {

    // public static int thirdLargest(int a[], int n) {
    // int temp = 0;
    // for (int i = 0; i < n; i++) {
    // for (int j = i + 1; j < n; j++) {
    // if (a[i] < a[j]) {
    // temp = a[i];
    // a[i] = a[j];
    // a[j] = temp;
    // }
    // }
    // }
    // return a[2];
    // }

    // public static void main(String[] args) {
    // int a[] = new int[] { 1, 2, 3, 4, 5, 6, 7, 8 };
    // System.out.println(thirdLargest(a, 8));
    // }

    // second method to find largest number

    public static void main(String[] args) {

        try (Scanner as = new Scanner(System.in)) {

            System.out.println("Enter the length of array:");
            int n = as.nextInt();

            int arr[] = new int[n];
            System.out.println("Original Array Are: ");
            for (int i = 0; i < n; i++) {
                // System.out.print(arr[i]);
                arr[i] = as.nextInt();
            }
            int max;
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    if (arr[i] < arr[j]) {
                        max = arr[i];
                        arr[i] = arr[j];
                        arr[j] = max;
                    }
                }
            }
            System.out.println();
            System.out.println("Third Largest number are: " + arr[2]);
        }

    }

}
