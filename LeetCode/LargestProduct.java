package LeetCode;

public class LargestProduct {
    public static int maxproduct(int[] arr) {

        // base case
        if (arr.length == 1) {
            return arr[0];
        }

        // sort the array first

        for (int i = 0; i < arr.length; i++) {
            int temp = 0;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        // find max pair
        int max = arr[arr.length - 1];
        int j = 1;
        for (int i = 0; i < arr.length && j < arr.length; i++, j++) {
            if (arr[i] * arr[j] > max) {
                max = arr[i] * arr[j];

            }

        }
        return max;

    }

    public static void main(String[] args) {
        int[] arr = { 2, 3, -1, 4 };
        System.out.println(maxproduct(arr));
    }
}
