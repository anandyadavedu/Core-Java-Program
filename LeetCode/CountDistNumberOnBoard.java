package LeetCode;

import java.util.*;

public class CountDistNumberOnBoard {
    public static void countNo(int n) {
        // Stack<Integer> s = new Stack<Integer>();
        List<Integer> list = new ArrayList<Integer>();
        int count = 0;
        // int[] arr=new int[n];
        list.add(n);

        for (int i = 1; i <= n; i++) {

            if (list.indexOf(list) % i == 1) {
                count++;
                list.add(count, i);
            }

        }
        System.out.println(list);

        // return list.size();
    }

    public static void main(String[] args) {
        countNo(5);
        // System.out.println(result);
    }

}
