package LeetCode;

public class RemoveDuplicateFromSortedArray {
    public static void removeDuplicate(int arr[]) {
        int temp = -1;
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    arr[i] = temp;
                    count = count + 1;

                }

            }

        }
        System.out.print(count + " , ");
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 0) {
                System.out.print(arr[i] + " ");
            }
        }
    }

    public static void main(String[] args) {
        int brr[] = { 1, 1, 2, 3, 4, 4, 5 };
        removeDuplicate(brr);

    }
}
