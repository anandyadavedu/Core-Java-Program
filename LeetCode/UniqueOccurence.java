package LeetCode;

import java.util.*;

public class UniqueOccurence {
    public static boolean uniqueOccurrences(int arr[]) {
        int brr[] = new int[arr.length];
        int temp = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != temp) {
                int count = 1;
                for (int j = i + 1; j < arr.length; j++) {
                    if (arr[i] == arr[j]) {
                        count++;
                        arr[j] = temp;

                    }

                }
                if (brr[i] != temp) {
                    brr[i] = count;
                }
            }

        }
        // boolean b=true;
        int c = 0;
        for (int i = 0; i < brr.length; i++) {
            if (brr[i] != 0) {

                for (int j = i + 1; j < brr.length; j++) {
                    if (brr[i] == brr[j]) {
                        c++;
                        // return false;
                        break;

                    }

                }
            }

        }
        if (c == 0) {
            // System.out.println("unique");
            return true;
        } else
            // System.out.println("differ");
            return false;

    }

    public static void main(String args[]) {
        try (Scanner as = new Scanner(System.in)) {

            System.out.println("Enter the length of the array");
            int n = as.nextInt();

            int arr[] = new int[n];
            System.out.println("Enter the element of Array:");
            for (int i = 0; i < n; i++) {
                arr[i] = as.nextInt();

            }
            if (uniqueOccurrences(arr))

                System.out.print("true");

            else
                System.out.println("false");
        }

    }
}
