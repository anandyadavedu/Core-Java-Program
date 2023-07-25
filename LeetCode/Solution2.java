package LeetCode;

public class Solution2 {

    public boolean uniqueOccurrences(int[] arr) {
        int brr[] = new int[arr.length];
        int count = 1;
        int temp = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != temp) {
                for (int j = i + 1; j < arr.length; j++) {
                    if (arr[i] == arr[j]) {
                        count++;
                        arr[j] = temp;
                    }

                }
                brr[i] = count;
            } else {
                brr[i] = temp;

            }

        }
        System.out.println(" new array");
        for (int i = 0; i < brr.length; i++) {
            System.out.print(brr[i] + " ");
        }
        int c = 0;
        for (int i = 0; i < brr.length; i++) {

            for (int j = i + 1; j < brr.length; j++) {
                if (brr[i] != -1 || (brr[j] != -1)) {
                    if (brr[i] == brr[j]) {
                        c++;
                        break;

                    }
                }
            }
        }
        if (c > 0) {
            return false;
        } else
            return true;
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 2, 1, 1, 3 };
        Solution2 obj = new Solution2();

        if (obj.uniqueOccurrences(arr)) {
            System.out.println("true");
        } else
            System.out.println("false");

    }
}