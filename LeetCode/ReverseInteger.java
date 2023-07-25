package LeetCode;

public class ReverseInteger {
        public static int reversed(int num) {
        if ((num <= 2147483647) && (num >= -2147483648)) {

            int rev = 0, count = 0;
            int rem;
            // int temp = num;
            // int temp1 = -num;
            if (num < 0) {
                num = num * (-1);
                count++;
            }
            while (num > 0) {
                rem = num % 10;
                if (rev > Integer.MAX_VALUE / 10 || rev < Integer.MIN_VALUE / 10)
                    return 0;
                rev = rev * 10 + rem;
                num = num / 10;

            }
            if (count > 0) {
                return rev * (-1);
            } else {
                return rev;
            }
        } else {
            return 0;
        }
    }

    public static int secondMethod(int num) {
        int rev = 0;
        while (num != 0) {
            int rem = num % 10;
            num = num / 10;
            if (rev > Integer.MAX_VALUE / 10 || rev < Integer.MIN_VALUE / 10)
                return 0;
            rev = rev * 10 + rem;
        }
        return rev;
    }

    // string sum as integer.

    public static String sum(String num1, String num2) {
        int sum = 0;
        int x = Integer.parseInt(num1);
        int y = Integer.parseInt(num2);
        sum = x + y;

        String result = String.valueOf(sum);

        return result;

    }

    public static void main(String[] args) {
        int ans = reversed(1203456789);
        System.out.println(ans);

        int ans2 = secondMethod(-24262);
        System.out.println(ans2);

        System.out.print(sum("11", "123"));

    }
}
