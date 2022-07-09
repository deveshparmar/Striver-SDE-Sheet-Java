package Day4;

import java.util.HashMap;

public class Q1 {
    public int[] twoSum(int[] nums, int target) {
        int[]arr = new int[2];
        HashMap<Integer,Integer>hm = new HashMap<>();
        for(int i=0;i< nums.length;i++){
           if(hm.containsKey(target-nums[i])){
               int p = hm.get(target-nums[i]);
               arr[0] = i;
               arr[1] = p;
           }else{
               hm.put(nums[i],i);
           }
        }
        return arr;
    }
}
