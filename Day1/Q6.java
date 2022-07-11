package Day1;

public class Q6 {
    public int maxProfit(int[] prices) {
        int n = prices.length;
        if(n==0){
            return 0;
        }
        int min = prices[0];
        int max_profit = 0;
        for(int nums : prices){
            min = Math.min(min,nums);
            max_profit = Math.max(nums-min,max_profit);
        }
        return max_profit;
    }
}
