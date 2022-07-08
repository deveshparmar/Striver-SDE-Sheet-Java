package Day3;

import java.util.ArrayList;

public class Q6 {
    public int reversePairs(int[] nums) {
        return mergeSort(nums,0,nums.length-1);
    }
    public int merge(int[]arr,int l,int m,int h){
        int c = 0;
        int j = m+1;
        for(int i = l;i<=m;i++){
            while(j<=h && arr[i]>(2*(long)arr[j])){
                j++;
            }
            c+=(j-(m+1));
        }
        ArrayList<Integer> list = new ArrayList<>();
        int p = l, q = m+1;
        while(p<=m && q<=h){
            if(arr[p]<=arr[q]){
                list.add(arr[p++]);
            }else{
                list.add(arr[q++]);
            }
        }
        while(p<=m){
            list.add(arr[p++]);
        }
        while(q<=h){
            list.add(arr[q++]);
        }
        for(int i=l;i<=h;i++){
            arr[i] = list.get(i-l);
        }
        return c;
    }
    public int mergeSort(int[] arr,int l,int h){
        int inv = 0;
        if(l>=h)
            return 0;
        int mid = (l+h)/2;
        inv+=mergeSort(arr,l,mid);
        inv+=mergeSort(arr,mid+1,h);
        inv+=merge(arr,l,mid,h);

        return inv;
    }
}
