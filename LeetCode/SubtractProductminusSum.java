package LeetCode;

public class SubtractProductminusSum {
    public static int method(int n) {
        int rem;
        // int answer=0;
        int product = 1, sum = 0;
        while (n > 0) {
            rem = n % 10;
            product = product * rem;
            sum = sum + rem;
            n = n / 10;

        }
        return product - sum;

    }

    public static void main(String[] args) {
        int n = 234;
        System.out.println(method(n));

    }

}
