package LeetCode;

public class reversedArrayOfString {
    public static void reversed(char[] s) {
        int j = 1;
        for (int i = 0; i < s.length / 2; i++) {
            char temp = s[s.length - j];
            s[s.length - j] = s[i];
            s[i] = temp;
            j++;
        }
        for (int i = 0; i < s.length; i++) {
            System.out.print(s[i] + ",");
        }
    }

    public static void main(String[] args) {
        char[] s = { 'a', 'b', 'c', 'd', 'e' };
        reversed(s);
    }
}
