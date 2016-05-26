public class Solution {
    public int maxProfit(int[] prices) {
        if (prices == null || prices.length == 0){
            return 0;
        }
        int n = prices.length;
        int[][] states = new int[3][n];
        states[0][0] = -prices[0];
        states[1][0] = 0;
        states[2][0] = 0;
        for (int i = 1; i < n; i++){
            states[0][i] = Math.max(states[0][i - 1], states[2][i - 1] - prices[i]);
            states[1][i] = states[0][i - 1] + prices[i];
            states[2][i] = Math.max(states[1][i - 1], states[2][i - 1]);
        }
        return Math.max(states[1][n - 1], states[2][n - 1]);
    }
}