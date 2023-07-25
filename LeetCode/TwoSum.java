package LeetCode;
import java.util.*;

public class TwoSum {
    public static int[] twoSum(int[] nums, int target) {
        int[] arr=new int[2];
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
            
                if(nums[i]+nums[j]==target){
                  arr[0]=i;
                  arr[1]=j;
                
                }
            }
        
        }
        
        return arr;
    }
    public static void main(String[] args) {
        int[] nums={1,6,4,3};
        int target=10;
        System.out.print(twoSum(nums,target));
    }
    
}
