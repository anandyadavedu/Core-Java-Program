package LeetCode;
import java.util.*;

public class PascalsTriangle {
    public static List<Integer> getRow(int rowIndex){
        List<Integer> list=new ArrayList<>();
        int count=1;
        while(rowIndex>0){
            list.add(count++);
            rowIndex--;
        }
        return list;
    }
    public static void main(String[] args) {
        System.out.print(getRow(3));
    }
    
}
