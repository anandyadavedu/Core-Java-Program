package LeetCode;
import java.util.*;

public class MostFrequentEvenElement {
    public static int mostFrequentEven(int[] nums){
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(nums[i]/2==0){
                if(map.containsKey(nums[i])){
                    map.put(nums[i],map.get(nums[i])+1);
                }else{
                    map.put(nums[i],map.get(nums[i]));
                }
            }
        }
        int max=0;
        for(int most:map.keySet()){
            if(map.get(most)>max){
                max=map.get(most);
            }
        }
        return max;
    }
    public static void main(String[] args) {
        int[] nums={1,2,2,3,4,4,5,6,2};
        System.out.println(mostFrequentEven(nums));
    }
}
