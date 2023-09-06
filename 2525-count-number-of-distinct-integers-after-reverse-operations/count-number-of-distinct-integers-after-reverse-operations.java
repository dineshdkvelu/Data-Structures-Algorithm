class Solution {
    public int countDistinctIntegers(int[] nums) {
        int n = nums.length;
        HashSet<Integer> store = new HashSet<>();
        for(int i=0; i<n; i++){
            int a = nums[i];
            int temp =0;
            int num = 0;
            store.add(a);
            while(a!=0){
                int c = a%10;
                a = a/10;
                num = ( num * 10) + c;
            }
            store.add(num);
        }
        return store.size();
    }
}