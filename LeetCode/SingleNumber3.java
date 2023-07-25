package LeetCode;

public class SingleNumber3 {

    public static int[] single3(int[] nums) {
        // int[] list=new ArrayList<>();
        int[] result = new int[2];
        int visited = -1;
        int occur = 0;
        for (int i = 0; i < nums.length; i++) {
            int count = 0;
            if (nums[i] != visited) {
                for (int j = i + 1; j < nums.length; j++) {
                    if (nums[i] == nums[j]) {
                        count++;
                        nums[j] = visited;
                    }
                }
                if (count == 0) {
                    if (occur == 0) {
                        result[0] = nums[i];
                        occur++;
                    } else
                        result[1] = nums[i];
                    break;

                }

            }
        }
       return result;

    }

    public static void main(String[] args) {
        int[] nums = { 1, 2, 1, 3, 2, 5 };
        int[] ans = single3(nums);
        System.out.println(ans);

    }
}
