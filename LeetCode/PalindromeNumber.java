package LeetCode;

public class PalindromeNumber {
    public static boolean pn(int n) {
        if (n < 0) {
            return false;
        } else {

            int temp = n;
            int rev = 0;
            while (n != 0) {

                int rem = n % 10;
                rev = rev * 10 + rem;
                n = n / 10;

            }

            // System.out.println(rev);
            if (temp == rev) {
                // System.out.println("Palindrome Number");
                return true;
            } else {
                return false;
            }
        }

    }

    public static void main(String[] args) {
        pn(-121);
    }
}
