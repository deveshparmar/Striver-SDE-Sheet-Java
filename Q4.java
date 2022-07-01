package Day1;

public class Q4 {
    public int maxSubArray(int[] nums) {
        int maxSum = Integer.MIN_VALUE;
        int sum=0;
        for (int num : nums) {
            sum += num;
            maxSum = Math.max(maxSum, sum);
            if (sum < 0) {
                sum = 0;
            }
        }
        return maxSum;
    }
}
