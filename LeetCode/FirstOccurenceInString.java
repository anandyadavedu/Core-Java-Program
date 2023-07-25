package LeetCode;

public class FirstOccurenceInString {
    public static int firstOccurence(String S1, String S2) {
        // int n1=S1.length();
        // int n2 = S2.length();
        // String sub = S1.substring(0, n2);
        boolean b = S1.contains(S2);
        if (b) {
            int n = S1.indexOf(S2);
            return n;
        } else
            return -1;

    }

    public static void main(String[] args) {
        String S1 = "leetcode";
        String S2 = "leet";
        int result = firstOccurence(S1, S2);
        System.out.println(result);
    }

}
