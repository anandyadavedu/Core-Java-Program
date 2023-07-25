package LeetCode;

public class SumOfTwoString {
    public static String sum(String str1, String str2) {
        int a = Integer.parseInt(str1);
        int b = Integer.parseInt(str2);
        int sum = a + b;
        String result = String.valueOf(sum);
        return result;
    }

    public static void main(String[] args) {
        // String str1=12;
        // String str2=15;
        System.out.println(sum("10", "20"));

    }
}
