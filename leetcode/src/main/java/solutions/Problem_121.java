package solutions;

public class Problem_121 {
    public int maxProfit(int[] prices) {
        int maxSoFar = 0;
        int currMax = 0;
        for (int i = 1; i < prices.length; i++) {
            int dif = prices[i] - prices[i-1];
            currMax = Math.max(dif, currMax + dif);
            maxSoFar = Math.max(maxSoFar, currMax);
        }
        return maxSoFar;
    }
}
