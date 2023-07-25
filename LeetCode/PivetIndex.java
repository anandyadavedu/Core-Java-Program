package LeetCode;

public class PivetIndex {
    public static int pivet(int[] nums) {
        int count = -1;
        for (int i = 0; i < nums.length; i++) {
            if (count == -1) {
                int index = i;
                int leftsum = 0;
                int rightsum = 0;

                for (int j = 0; j < nums.length; j++) {
                    if (j < i)
                        leftsum = leftsum + nums[j];
                    else if (j > i) {
                        rightsum = rightsum + nums[j];
                    } else {
                        continue;
                    }
                }
                if (leftsum == rightsum)
                    count = index;

            } else
                return count;

        }
        return count;

    }

    public static void main(String[] args) {
        int[] nums = { -1, -1, 0, 0, -1, -1 };
        int[] nums1 = { 1, 7, 3, 6, 5, 6 };

        System.out.println((pivet(nums)));
        System.out.println((pivet(nums1)));
    }

}
