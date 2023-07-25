package LeetCode;

public class CountOdd {
    public static int countOdds(int low, int high) {
        int count = 0;
        int total = high - low + 1;

        if ((low % 2 == 0 && high % 2 == 0) || (low % 2 == 0 && high % 2 == 1) || (low % 2 == 1 && high % 2 == 0)) {
            count = total / 2;
        } else {
            count = total / 2 + 1;
        }
        return count;
    }

    public static void main(String[] args) {
        int result = countOdds(2, 10);
        // int result2=countOdds(1, 10);
        // countOdds(2, 11);
        // countOdds(1, 11);
        System.out.println(result);

    }
}
