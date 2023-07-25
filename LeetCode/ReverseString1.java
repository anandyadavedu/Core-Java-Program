package LeetCode;

public class ReverseString1 {
    public static void reverse(String str) {
        char[] ch = str.toCharArray();
        for (int i = ch.length - 1; i >= 0; i--) {
            System.out.print(ch[i]);
        }
    }

    public static void wordcount(String str) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if ((str.charAt(i) == ' ') && (str.charAt(i + 1) == ' ')) {
                count++;
            }
        }
        System.out.println(count);
    }

    public static void main(String[] args) {
        String name = "AnandYadav";
        reverse(name);
        wordcount(name);
    }
}
