class Solution {
    public int maxProfit(int[] p) {
        int n = p.length;
        int res =0;
        int max = p[n-1];
        for(int j = n-1; j>=0; j--){
            if(max - p[j] > res) res = max- p[j];
            if(p[j] > max) max = p[j];
        }
        return res;
    }
}