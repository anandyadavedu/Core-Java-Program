package LeetCode;

import java.util.ArrayList;
import java.util.*;

public class SparxMatrix2 {

    public static List<Integer> sparx(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;

        List<Integer> list = new ArrayList<Integer>();
        int count = 0, total = m * n;
        int minr = 0, maxr = m - 1, minc = 0, maxc = n - 1;

        while (count < total) {

            // for min row
            // this is the first move in sparx matrix
            for (int i = minc; i <= maxc && count < total; i++) {
                list.add(matrix[minr][i]);
                count++;

            }
            minr++;

            // for max column

            for (int i = minr; i <= maxr && count < total; i++) {
                list.add(matrix[i][maxc]);
                count++;

            }
            maxc--;

            // for max row

            for (int i = maxc; i >= minc && count < total; i--) {
                list.add(matrix[maxr][i]);
                count++;

            }
            maxr--;

            // for min column
            for (int i = maxr; i >= minr && count < total; i--) {
                list.add(matrix[i][minc]);
                count++;
            }
            minc++;
        }

        return list;

    }

    public static void main(String[] args) {
        int[][] matrix = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
        System.out.print(sparx(matrix));

    }
}
/*
 * ---------------> min row
 * | |
 * | |
 * | |
 * | |
 * <--------------- max row
 * m max colm
 * i
 * n
 * 
 * c
 * o
 * l
 * u
 * m
 * n
 */
