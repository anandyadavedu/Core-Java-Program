package Recursion;

public class SubSequences {
    public static void subsequences(String str, int idx, String newString) {
        // base case defined

        if (idx == str.length()) {
            System.err.println(newString);
            return;
        }

        char currChar = str.charAt(idx);

        // to be chooses
        subsequences(str, idx + 1, newString + currChar);

        // not to be chooses
        // @ is the not chooses character
        subsequences(str, idx + 1, newString + '@');

    }

    public static void main(String[] args) {
        String str = "abc";
        subsequences(str, 0, "");
    }
}
