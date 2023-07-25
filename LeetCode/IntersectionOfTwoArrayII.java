package LeetCode;
import java.util.*;

public class IntersectionOfTwoArrayII {

    public static List<Integer> intersectionII(int[] nums1,int[] nums2){
        List<Integer> list=new ArrayList<>();
        List<Integer> list1=new ArrayList<>();

        for(int i=0;i<nums1.length;i++){
            list.add(nums1[i]);
        }

        for (int j = 0; j < nums2.length; j++) {
            if(list.contains(nums2[j])){
                list1.add(nums2[j]);
                list.remove(nums2[j]);
            }
        }
        return list1;
        // int[] arr=new int[list1.size()];
        // for(int k=0;k<list1.size();k++){
        //     arr[k]=list1.get(k);
        // }
        // return arr;
    }
    public static void main(String[] args) {
        int[] nums1={1,2,3,4,2,5};
        int[] nums2={2,2,3,4};
        System.out.println(intersectionII(nums1, nums2));
    }
}
