package LeetCode;
import java.util.*;

public class IntersectionOfTwoArray {
    public static int[] intersection(int[] nums1,int[] nums2){
        HashSet<Integer> set=new HashSet<>();
        List<Integer> list=new ArrayList<>();
        
        for(int i=0;i<nums1.length;i++){
            set.add(nums1[i]);
        }
        
        for(int j=0;j<nums2.length;j++){
            if(set.contains(nums2[j])){
                list.add(nums2[j]);
                set.remove(nums2[j]);
            }
        }
        int[] arr=new int[list.size()];
        for(int k=0;k<list.size();k++){
            arr[k]=list.get(k);
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] nums1={1,2,3};
        int[] nums2={1,2,4,5};

        System.out.print(intersection(nums1, nums2));
    }
    
}
