package Array;

import java.util.Scanner;

public class MaxAndMin {

    // max method is created
    public static int max(int arr[]) {
        int max = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }

    // min method is created
    public static int min(int arr[]) {
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        return min;
    }

    // main method is invoked
    public static void main(String[] args) {
        // taking user input as array element
        try (Scanner as = new Scanner(System.in)) {

            // taking length of array from user
            System.out.println("Enter the length of array:");
            int n = as.nextInt();

            // insertion of element in array
            int array[] = new int[n];
            System.out.print("Enter the element of array:");

            for (int i = 0; i < n; i++) {
                array[i] = as.nextInt();
            }

            // calling the max and min method withod created object
            System.out.println("Maximum number in the array is: " + max(array));
            System.out.println("minimum number in the array is: " + min(array));
        }
    }

}
