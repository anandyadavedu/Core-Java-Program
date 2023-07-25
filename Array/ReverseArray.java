package Array;

//import java.util.Scanner;

public class ReverseArray {

    // reverse an array using recursive method

    public static void reverseUsingRecursion(int[] brr, int start, int end) {
        if (start >= end) {

            return;
        }

        int temp = brr[start];
        brr[start] = brr[end];
        brr[end] = temp;

        reverseUsingRecursion(brr, start + 1, end - 1);

    }

    public static void print(int brr[], int length) {
        for (int i = 0; i < brr.length; i++) {
            System.out.println(brr[i]);
        }
    }

    public static void main(String[] args) {

        // This is the iterative reverse method

        /*
         * try (Scanner as = new Scanner(System.in)) {
         * 
         * System.out.println("Enter the length of array:");
         * int n = as.nextInt();
         * 
         * // array declation
         * int arr[] = new int[n];
         * System.out.println("Enter the element of the array:");
         * 
         * for (int i = 0; i < n; i++) {
         * arr[i] = as.nextInt();
         * }
         * 
         * System.out.println("Reverse array are: ");
         * 
         * for (int i = n - 1; i >= 0; i--) {
         * System.out.println(arr[i] + " ");
         * }
         * 
         * }
         */

        int brr[] = { 1, 2, 3, 4, 5, 6 };
        reverseUsingRecursion(brr, 0, 5);
        print(brr, 6);
    }

}
