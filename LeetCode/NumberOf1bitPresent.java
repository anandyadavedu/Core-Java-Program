package LeetCode;

public class NumberOf1bitPresent {
    public static void bitNumber(int n) {
        int count = 0;
        for (int i = 0; i < 32; i++) {
            if (((n >> i) & 1) == 1) {
                count++;
            }

        }
        System.out.println(count);
    }

    public static void main(String[] args) {
        bitNumber(222);
    }
}
