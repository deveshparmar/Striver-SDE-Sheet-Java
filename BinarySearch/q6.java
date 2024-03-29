class Solution {
    public long kthElement( int arr1[], int arr2[], int n, int m, int k) {
        
        int ans[] = new int[n+m];
        int i = 0;
        int j = 0;
        int l = 0;
        while(i<n && j<m){
            if(arr1[i]<=arr2[j]){
                ans[l] = arr1[i];
                i++;
                l++;
            }else if(arr1[i]>arr2[j]){
                ans[l] = arr2[j];
                j++;
                l++;
            }
        }
        while(i<n){
            ans[l] = arr1[i];
            l++;
            i++;
        }
        
        while(j<m){
            ans[l] = arr2[j];
            l++;
            j++;
        }
        
        return ans[k-1];
    }
}
