class Solution {
    // public int maxProfit(int[] prices) {
    //     Stack<Integer> store = new Stack<>();
    //     int n = prices.length;
    //     int res =0;
    //     int next[] = new int[n];
    //     for(int j=n-1; j>=0; j--){
    //         if(!store.isEmpty()){
    //             if(prices[j] >= store.peek()){
    //                 while(!store.isEmpty() && prices[j] >=  store.peek()) store.pop();
    //                 store.push(prices[j]);
    //             }
    //             if(prices[j] < store.peek()){
    //                 res += store.peek() - prices[j];
    //                 store.push(prices[j]);
    //             }

    //         }else store.push(prices[j]);
    //     }
    //     return res;
    // }
     public int maxProfit(int[] prices) {
		// We need prices for 2 days at least to find the profit.
        if (prices == null || prices.length <= 1) {
            return 0;
        }

        int totalProfit = 0;
        for (int i = 1; i < prices.length; i++) {
            // Checking if we can profit with previous day's price.
            // If yes, then we buy on previous day and sell on current day.
            // Add all such profits to get the total profit.
            if (prices[i - 1] < prices[i]) {
                totalProfit += prices[i] - prices[i - 1];
            }
        }

        return totalProfit;
    }
}