package LeetCode;
import java.util.*;

public class ThreeSum {
    public static List<List<Integer>> threeSum(int[] nums){
    ArrayList<List<Integer>> arrlist=new ArrayList<>();
    List<Integer> list=new ArrayList<>();
    
         for (int i = 0; i < nums.length; i++) {
            int count=0;
            for (int j = i+1; j < nums.length; j++) {
                for (int k = j+1; k < nums.length; k++) {
                    if(i!=j && j!=k && i!=k){
                      if(nums[i]+nums[j]+nums[k]==0){
                        list.add(nums[i]);
                        list.add(nums[j]);
                        list.add(nums[k]);
                        arrlist.add(list);
                        count++;
                        break;
                        
                      }
                    }
                }   
                if(count>0){
                    break;
                }
            }
            // if(count>0){
            //     break;
            // }
        }
        return arrlist;
    }
    public static void main(String[] args) {
        int[] nums={-1,0,1,2,-1,-4};
        System.out.println(threeSum(nums));
       
    }
}
