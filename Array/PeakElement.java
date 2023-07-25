package Array;

public class PeakElement {
    public static int max(int[] arr) {
        int max = arr[0]; // count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (max < arr[i]) {
                max = arr[i];
                // count = i;
            }
        }
        return max;
        // if i want to return the index value the simply return count

        // return count;
    }

    public static int min(int[] arr) {
        int min = arr[0]; // count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (min > arr[i]) {
                min = arr[i];
                // count = i;
            }
        }
        return min;
        // return count;
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5, 6 };
        System.out.println(max(arr));
        System.out.println(min(arr));
    }
}
