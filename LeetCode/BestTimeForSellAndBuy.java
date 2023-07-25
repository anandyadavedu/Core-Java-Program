package LeetCode;

public class BestTimeForSellAndBuy {
    public static int maxProfit(int[] arr) {
        int max = -10000;
        if (arr.length == 1) {
            return 0;
        } else {

            int min = arr[0];
            int temp = 0;
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] < min) {
                    temp = i;
                    min = arr[i];
                }
            }
            if (temp == arr.length - 1) {
                return 0;
            }

            else {

                for (int i = temp; i < arr.length; i++) {
                    if (arr[i] > max) {
                        max = arr[i];
                    }
                }
            }

            return max - arr[temp];
        }

    }

    // Easiest way

    public static int maxi(int brr[]) {
        int max = 0;
        int min = brr[0];
        for (int i = 0; i < brr.length; i++) {
            min = Math.min(min, brr[i]);
            max = Math.max(max, brr[i] - min);
        }
        return max;
    }

    public static void main(String[] args) {
        int[] brr = { 7, 6, 5, 4, 3, 2, 1 };
        System.out.println(maxProfit(brr));
    }
}
