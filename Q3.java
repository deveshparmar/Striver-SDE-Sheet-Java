package Day1;

public class Q3 {
    public void nextPermutation(int[] nums) {
        int n = nums.length;
        int k = n-2;
         if(nums.length==0 || nums==null)
             return;

         for(int i=n-1;i>0;i--){
             if(nums[i]<=nums[i-1]){
                 k--;
             }else{
                 break;
             }
         }
         if(k==-1){
             reverse(nums,0,n-1);
             return;
         }
         for(int i=n-1;i>0;i--){
             if(nums[i]>nums[k]){
                 int temp = nums[i];
                 nums[i]=nums[k];
                 nums[k]=temp;
                 break;
             }
         }
         reverse(nums,k+1,n-1);
    }
    public void reverse(int[] arr,int i,int j){
        while(i<j){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j]=temp;
            i++;
            j--;
        }
    }
}