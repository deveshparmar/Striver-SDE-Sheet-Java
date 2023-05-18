class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int m = nums1.length;
        int n = nums2.length;
        int l = m+n;
        double ans = 0;
       
        int[]arr = new int[l];
        int i=0, j = 0, k = 0;
        while(i<m && j<n){
            if(nums1[i]<=nums2[j]){
                arr[k] = nums1[i];
                i++;
                k++;
            }
            else if(nums1[i]>nums2[j]){
                arr[k]=nums2[j];
                j++;
                k++;
            }
        }
        while(i<m){
            arr[k] = nums1[i];
            k++;
            i++;
        }
         while(j<n){
            arr[k] = nums2[j];
            k++;
            j++;
        }

        if(l%2==0){
            ans = (arr[l/2-1])+(arr[l/2]);
            ans/=2;
        }

        else
            ans = arr[l/2];

        return ans;
    }
}
