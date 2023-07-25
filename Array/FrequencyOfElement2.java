package Array;

import java.util.Scanner;

public class FrequencyOfElement2 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter the length of arrays");
            int n = sc.nextInt();

            int[] arr = new int[n];
            System.out.println("Enter the element of arrays:");
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }

            System.out.println("Original Arrays are :-");
            for (int i = 0; i < n; i++) {
                System.out.print(arr[i] + " ");
            }
            System.out.println();
            // duplicate element of any arrays are-

            int brr[] = new int[n];

            for (int i = 0; i < n; i++) {
                int count = 1;
                for (int j = i + 1; j < n; j++) {
                    if (arr[i] == arr[j]) {
                        count++;
                        // arr[j]=anand;
                    }
                }
                brr[i] = count;

            }
            System.out.println("frequency of element are:-");
            for (int i = 0; i < brr.length; i++) {
                System.out.print(brr[i] + " ");

            }
        }
    }
}
