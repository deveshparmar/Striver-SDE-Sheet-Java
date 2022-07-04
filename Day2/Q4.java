package Day2;

import java.util.HashSet;

public class Q4 {
    public int findDuplicate(int[] nums) {
        int idx=0;
        for(int i=0;i<nums.length;i++){
            idx = Math.abs(nums[i]);

            if(nums[idx]<0)
                return idx;

            nums[idx] = -nums[idx];
        }
        return idx;
    }
}
