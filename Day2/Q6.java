package Day2;

import java.util.Scanner;

public class Q6 {
    public static int mergeSort(int[]arr,int l,int h){
        int inv =0;
        if(l<h){
            int mid = (l+h)/2;
            inv +=mergeSort(arr,l,mid);
            inv +=mergeSort(arr,mid+1,h);
            inv +=merge(arr,l,mid,h);
        }
        return inv;
    }
    public static int merge(int[] arr,int l,int mid,int h){
        int inv = 0;
        int  p = mid-l+1;
        int q = h-mid;
        int[] arr1 = new int[p];
        int[] arr2 = new int[q];

        for(int i=0;i<p;i++){
            arr1[i] = arr[l+i];
        }
        for(int j=0;j<q;j++){
            arr2[j] = arr[mid+j+1];
        }
        int i=0,j=0,k=l;
        while(i<p && j<q){
            if(arr1[i]<=arr2[j]){
                arr[k] = arr1[i];
                i++;
            }else{
                arr[k]=arr2[j];
                inv+=p-i;
                j++;
            }
            k++;
        }
        while(i<p){
            arr[k]= arr1[i];
            k++;
            i++;
        }
        while(j<q){
            arr[k] = arr2[j];
            k++;
            j++;
        }
        return inv;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println(mergeSort(arr,0,n-1));
    }
}
