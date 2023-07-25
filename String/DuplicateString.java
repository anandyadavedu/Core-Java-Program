package String;

import java.util.Scanner;

public class DuplicateString {
    public static void main(String[] args) {
        Scanner as = new Scanner(System.in);

        System.out.println("Enter the  String which you want to check the common element : ");
        String str = as.nextLine();
        as.close();

        // define a array which hold the character of string
        char[] arr = str.toCharArray();

        System.out.println("Duplicate character are:-->> ");

        for (int i = 0; i < arr.length; i++) {
            int count = 1;
            if (arr[i] != 0) {

                for (int j = i + 1; j < arr.length; j++) {
                    if (arr[i] == arr[j]) {
                        count++;
                        arr[j] = 0;
                        // System.out.println(arr[i]);

                    }
                }
            }

            // count-->>1 tells no common element
            if (count == 1)
                continue;
            // else condition use for common element
            else

                System.out.println(arr[i] + " is " + count + " times occurs ");

        }

    }
}
