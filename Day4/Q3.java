class Solution {
    public int longestConsecutive(int[] nums) {
        int ans = 0;
        Set<Integer>set = new HashSet<>();
        for(int x : nums)
            set.add(x);
        
        for(int i=0;i<nums.length;i++){
            int curr = nums[i];
            int len = 1;

            if(!set.contains(curr-1)){
                while(set.contains(curr+1)){
                    curr+=1;
                    len+=1;
                }

                ans = Math.max(ans,len);
            }

        }

        return ans;
    }
}
