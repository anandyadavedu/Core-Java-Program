package LeetCode;

public class SingleNumber2 {
    public static int single2(int[] arr) {
        int visited = -1;
        for (int i = 0; i < arr.length; i++) {
            int count = 0;
            if (arr[i] != visited) {
                for (int j = i + 1; j < arr.length; j++) {
                    if (arr[i] == arr[j]) {
                        count++;
                        arr[j] = visited;

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
        int arr[] = { 0, 1, 0, 1, 0, 1, 99 };
        int ans = single2(arr);
        System.out.println(ans);
    }

}
