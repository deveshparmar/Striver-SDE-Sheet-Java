package org.example.BinarySearch;

import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class q2 {
    public static void main(String[] args) {
        int[][] a = {{1,3,5},{2,6,9},{3,6,9}};
        int[][] b = {{6,17,100}};

        System.out.println(matMedian(b));
    }

    private static int matMedian(int[][] a) {
        int ans = 0;
        int[] arr = Stream.of(a).flatMapToInt(IntStream::of).toArray();
        Arrays.sort(arr);

        int n  = arr.length;
        System.out.println(Arrays.toString(arr));
        if(n%2==0){
            ans = arr[n/2] + arr[n/2]-1;
            ans/=2;
        }else {
            ans = arr[n/2];
        }
        return ans;
    }
}
