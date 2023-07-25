package Array;

import java.util.*;

public class SortArray {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter the number of element in Araay:");
            int n = sc.nextInt();

            System.out.println("Enter the Element in Array");
            int[] arr = new int[n];
            for (int i = 0; i < arr.length; i++) {
                arr[i] = sc.nextInt();
            }

            // sort

            for (int i = 0; i < arr.length; i++) {
                int temp = 0;
                for (int j = i + 1; j < arr.length; j++) {
                    if (arr[i] > arr[j]) {
                        temp = arr[i];
                        arr[i] = arr[j];
                        arr[j] = temp;

                    }

                }

            }
            System.out.println("Sorted Array");
            for (int i = 0; i < arr.length; i++) {
                System.out.print(arr[i] + " ");
            }
        }

    }
}
