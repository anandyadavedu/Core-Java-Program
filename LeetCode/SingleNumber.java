package LeetCode;

public class SingleNumber {
    // int temp=0;
    public static int singleNumber(int[] arr) {
        int visited = -400000;
        for (int i = 0; i < arr.length; i++) {
            int count = 0;
            if (arr[i] != visited) {

                for (int j = i + 1; j < arr.length; j++) {
                    if (arr[i] == arr[j]) {
                        count++;
                        arr[j] = visited;
                        break;
                    }
                }
                if (count == 0) {
                    return arr[i];
                }
            }
        }
        return -1;

    }

    public static void main(String[] args) {
        int[] arr = { 1, 0, 1 };
        int ans = singleNumber(arr);
        System.out.println(ans);

    }
}
