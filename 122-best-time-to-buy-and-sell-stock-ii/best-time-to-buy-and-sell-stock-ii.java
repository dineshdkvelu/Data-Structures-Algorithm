class Solution {
    public int maxProfit(int[] prices) {
        Stack<Integer> store = new Stack<>();
        int n = prices.length;
        int next[] = new int[n];
        for(int j=n-1; j>=0; j--){
            if(!store.isEmpty()){
                if(prices[j] >= store.peek()){
                    while(!store.isEmpty() && prices[j] >=  store.peek()) store.pop();
                    store.push(prices[j]);
                }
                if(prices[j] < store.peek()){
                    next[j] = store.peek();
                    store.push(prices[j]);
                }

            }else store.push(prices[j]);
        }
        //System.out.println(Arrays.toString(next));
        int res =0;
        for(int i=0; i<n; i++){
            if(next[i] != 0) res += next[i] - prices[i];
        }
        return res;
    }
}