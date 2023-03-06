class Solution
{
    int maxLen(int arr[], int n)
    {
        int len = 0;
        int sum = 0;
        var map = new HashMap<Integer,Integer>();
        for(int i=0;i<n;i++){
            sum+=arr[i];
            if(sum==0)
                len=i+1;
            else{
                if(map.get(sum)!=null){
                    len = Math.max(len,i-map.get(sum));
                }else{
                    map.put(sum,i);
                }
            }
        }
        
        return len;
    }
}
