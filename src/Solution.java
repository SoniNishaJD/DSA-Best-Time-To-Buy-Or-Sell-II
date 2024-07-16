class Solution {
    public int maxProfit(int[] prices) {
        int maxProfit = 0;

        // Iterate through the array of prices starting from the second element
        for (int i = 1; i < prices.length; i++) {
            // If the price on day i is greater than the price on day i-1, add the difference to maxProfit
            if (prices[i] > prices[i - 1]) {
                maxProfit += prices[i] - prices[i - 1];
            }
        }

        return maxProfit;
    }

    // Example test cases
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.maxProfit(new int[]{7, 1, 5, 3, 6, 4})); // Output: 7
        System.out.println(solution.maxProfit(new int[]{1, 2, 3, 4, 5}));   // Output: 4
        System.out.println(solution.maxProfit(new int[]{7, 6, 4, 3, 1}));   // Output: 0
    }
}
