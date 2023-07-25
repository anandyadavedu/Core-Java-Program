package LeetCode;

public class monotonicArray {
    public static boolean monoArray(int[] nums){
        int inc=0,dec=0;
        for(int i=0;i<nums.length-1;i++){
            if(nums[i]>nums[i+1]){
                inc++;
            }
            else if(nums[i]==nums[i+1]) {
                inc++;
                dec++;
            } else {
                dec++;
            }
        }
        if(inc==nums.length-1|| dec==nums.length-1){
            return true;
        }
        else{
            return false;
        }
    }
    public static void main(String[] args) {
        int[] nums={1,2,2,3};
        System.out.println(monoArray(nums));
    }
}
