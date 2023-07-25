package LeetCode;

public class HappyNumber {
    public static boolean happyNumber(int num) {
        int temp = 0;
        int count = 0;
        while (num > 0) {
            int sum = 0;

            while (num > 0) {
                int rem = num % 10;
                rem = rem * rem;
                sum = sum + rem;
                num = num / 10;
            }
            if (sum == 1) {
                temp++;
                return true;

            } else {
                num = sum;
                count++;
            }
        }
        if (count > 100) {
            return false;
        } else {
            if (temp == 1)
                return true;
            else {
                return false;
            }
        }
    }

    static void method(int n) {
        int rem = n % 10;
        int rem2 = n / 10;
        System.out.println(rem);
        System.out.println(rem2);
    }

    public static void main(String[] args) {
        boolean answer = happyNumber(2);
        System.out.println(answer);
        method(2);

    }
}
