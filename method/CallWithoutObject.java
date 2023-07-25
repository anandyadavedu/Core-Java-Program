package method;

import java.util.Scanner;

public class CallWithoutObject {

    // making method
    public static void prime(int n) {
        int count = 0;
        for (int i = 2; i <= n / 2; i++) {
            int rem = n % i;
            if (rem == 0) {
                count++;
                break;
            }
        }
        if (count == 0) {
            System.out.println("The Enter number " + n + " is PRIME NUMBER");
        } else {
            System.out.println("The Enter number is NOT PRIME :");
        }
    }

    // main function calling:
    public static void main(String[] args) {
        Scanner as = new Scanner(System.in);

        System.out.println("Enter the number which you want to check:");
        int n = as.nextInt();
        as.close();
        // calling method without object

        prime(n);

    }

}
