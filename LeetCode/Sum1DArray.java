package LeetCode;

public class Sum1DArray {
    public static int[] numsSum(int[] nums) {
        int[] arr = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            if (i == 0) {
                arr[i] = nums[0];
            } else {
                arr[i] = arr[i - 1] + nums[i];
            }
        }
        return arr;

    }

    public static void main(String[] args) {
        int nums[] = { 1, 2, 3, 4, 5 };

        // int[] brr = numsSum(nums);
        System.out.println(numsSum(nums));

    }
}
