package LeetCode;

public class AddBinary {
    public static String addbinary(String S1, String S2) {
        int n1 = S1.length() - 1;
        int n2 = S2.length() - 1;

        int sum = 0, carry = 0;
        StringBuilder result = new StringBuilder();

        while (n1 >= 0 || n2 >= 0 || carry == 1) {
            sum = carry;
            if (n1 >= 0)
                sum = sum + S1.charAt(n1) - '0';

            if (n2 >= 0)
                sum += S2.charAt(n2) - '0';

            result.append((char) (sum % 2 + '0'));

            carry = sum / 2;
            n1--;
            n2--;
        }
        return result.reverse().toString();

    }

    public static void main(String[] args) {
        String S1 = "1101";
        String S2 = "100";
        String str = addbinary(S1, S2);
        System.out.println(str);
    }
}
