package LeetCode;

public class NoOfSubArrayOfSizek {
    public static int subArray(int[] arr, int k, int thresold) {
        int count = 0;
        for (int i = 0; i <= arr.length - k; i++) {
            int sum = 0;
            float average = 0;

            for (int j = i; j < k + i; j++) {
                sum = sum + arr[j];
            }
            average = sum / k;
            if (average >= thresold) {
                count++;
            }

        }
        return count;
    }

    public static void main(String[] args) {
        int[] arr = { 2, 2, 2, 2, 5, 5, 5, 8 };
        int result = subArray(arr, 3, 4);
        System.out.println(result);
    }
}
