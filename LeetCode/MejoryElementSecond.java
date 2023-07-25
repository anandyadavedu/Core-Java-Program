package LeetCode;
import java.util.*;

public class MejoryElementSecond {
    public static List<Integer> mejority(int[] nums){
        HashMap<Integer,Integer> map=new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            if(map.containsKey(nums[i])){
               map.put(nums[i],map.get(nums[i])+1);
            }else{
                map.put(nums[i],1);
            }
        }
        List<Integer> list=new ArrayList<>();
        for(int freq:map.keySet()){
            if(map.get(freq)>nums.length/3){
               list.add(freq);
            }
        }
        return list;

    }

    public static void main(String[] args) {
        int[] nums={1,2,3,2,2,2,1,3,4,3};
        System.out.println(mejority(nums));
    }
    
}
