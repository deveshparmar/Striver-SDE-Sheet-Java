/*Problem Statement: Given an integer array arr, find the contiguous subarray (containing at least one number) which
has the largest sum and return its sum and print the subarray
Time complexity - O(n) */


package com.codewithdevesh.arrays;

import java.util.Scanner;

public class KadanesAlgorithm {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array");
        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Max subarray sum is :" + maxSubarraySum(arr, n));
    }

    private static long maxSubarraySum(int[] arr, int n) {
        int maxSum = 0;
        int maxNum = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            maxSum += arr[i];
            maxNum = Math.max(maxNum, maxSum);

            if (maxSum < 0) {
                maxSum = 0;
            }
        }
        return maxNum;
    }
}
