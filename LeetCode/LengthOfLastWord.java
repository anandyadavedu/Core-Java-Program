package LeetCode;

public class LengthOfLastWord {
    public static int lengthOfLast(String s) {
        if (s == null || s.isEmpty()) {
            return 0;
        }

        String words[] = s.split("\\s+");
        int n = words.length;

        return words[n - 1].length();

    }

    public static void main(String[] args) {
        String s = "Anand Kumar Yadav";
        int ans = lengthOfLast(s);
        System.out.println(ans);
    }

}
