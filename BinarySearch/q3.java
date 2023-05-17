class Solution {
    public int singleNonDuplicate(int[] nums) {
       int l = 0;
       int h = nums.length-2;

       while(l<=h){
           int mid = l + (h-l)/2;
           if(mid%2==0){ 
                if(nums[mid]!=nums[mid+1])
                        h = mid-1;
           else
                l = mid+1;
           }
            else{
                if(nums[mid]==nums[mid+1])
                    h = mid-1;
                else
                    l = mid+1;
            }
       }

       return nums[l];
    }
}
Console
