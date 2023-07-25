package LeetCode;

public class ContainerWithMostWater {
    public static int maxWater(int[] height) {
        int n = height.length;
        int volume = 0;
        // int finalResult = 0;
        for (int i = 0; i < n; i++) {
            // int count = 0;
            int min = Integer.MAX_VALUE;
            for (int j = i; j < n; j++) {
                min = Math.min(min, height[j]);
                volume = Math.max(volume, min * (j - i));
                // count = (j - i + 1);
                // if (min * count > volume) {
                // volume = min * count;
                // }

            }
            // if (volume > finalResult) {
            // finalResult = volume;
            // }

        }
        return volume;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 1 };
        System.out.println(maxWater(arr));
    }

}
