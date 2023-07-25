package LeetCode;

class Solution {
    public static boolean halvesAreAlike(String s) {
        String vowels = "aeiouAEIOU";
        int mid = s.length() / 2;
        int answer = 0;
        for (int i = 0, j = mid; i < mid; i++, j++) {

            if (vowels.indexOf(s.charAt(i)) >= 0)
                answer++;
            if (vowels.indexOf(s.charAt(j)) >= 0)
                answer--;

        }
        return answer == 0;
    }

    public static void main(String[] args) {
        String str = "Anandaad";

        System.out.println(halvesAreAlike(str));

    }

}