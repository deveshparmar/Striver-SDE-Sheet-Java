class Solution {
    public int search(int[] nums, int target) {
        return helper(0,nums.length-1,nums,target);
    }
    private int helper(int l,int h,int[] nums, int target){
        if(l>h) return -1;

        int mid = (l+h)/2;

        if(nums[mid]==target) return mid;

        if(nums[l]<=nums[mid]){
            if(target>=nums[l] && target<=nums[mid]){
                return helper(l,mid-1,nums,target);
            }
            return helper(mid+1,h,nums,target);
        }

        if(target>=nums[mid] && target<=nums[h]){
            return helper(mid+1,h,nums,target);
        }
        return helper(l,mid-1,nums, target);
    }
    
}
