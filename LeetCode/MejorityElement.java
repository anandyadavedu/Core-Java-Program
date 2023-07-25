package LeetCode;

public class MejorityElement {
    public static int mejority(int[] nums) {

        for (int i = 0; i < nums.length; i++) {
            int count = 1;
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] == nums[j]) {
                    count++;
                }
            }
            if (count > nums.length / 2) {
                return nums[i];
            }

        }
        return -1;
    }

    public static void main(String[] args) {
        int nums[] = { 1, 2, 2, 2, 4 };
        System.out.println(mejority(nums));
    }
}
