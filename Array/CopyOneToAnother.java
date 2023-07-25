package Array;

public class CopyOneToAnother {
    public static void main(String[] args) {
        int[] arr1 = { 1, 2, 3, 4, 5 };
        int[] arrNew = new int[arr1.length];
        for (int i = 0; i < arr1.length; i++) {
            arrNew[i] = arr1[i];
        }
        System.out.println("New Array");
        for (int i = 0; i < arrNew.length; i++) {
            System.out.print(arrNew[i] + " ");
        }

    }

}
