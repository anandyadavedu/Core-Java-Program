package LeetCode;

public class LangestParameterTriangle {
    public static int longestparameter(int[] nums) {
        int parameter = 0;
        for (int i = 0; i < nums.length; i++) {
            int temp = 0;
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] > nums[j]) {
                    temp = nums[i];
                    nums[i] = nums[j];
                    nums[j] = temp;
                }
            }
        }
        for (int k = 0; k < nums.length - 2; k++) {
            if (nums[k] < nums[k + 1] + nums[k + 2]) {
                parameter = nums[k] + nums[k + 1] + nums[k + 2];
            }

        }
        return parameter;

    }

    public static void main(String[] args) {
        int[] nums = { 1, 2, 1, };
        System.out.println(longestparameter(nums));

    }
}
