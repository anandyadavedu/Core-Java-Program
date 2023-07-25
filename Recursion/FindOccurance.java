package Recursion;

public class FindOccurance {
    static int first = -1;
    static int last = -1;

    public static void findOccurance(String str, int idx, char element) {
        if (idx == str.length()) {
            System.out.println("The first occurance of the " + element + " are: " + first);
            System.out.println("The last occurance of the " + element + " are: " + last);
            return;
        }

        char currChar = str.charAt(idx);
        if (currChar == element) {
            if (first == -1) {
                first = idx;
            } else {
                last = idx;
            }
        }
        findOccurance(str, idx + 1, element);
    }

    public static void main(String[] args) {
        String str = "abcdabadag";
        findOccurance(str, 0, 'a');
    }
}
