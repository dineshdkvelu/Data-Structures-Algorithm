class Solution {
    public int lengthOfLongestSubstring(String s) {
        char a[] = s.toCharArray();
        int n = a.length;
        if( n == 0 ) return 0;
        HashSet<Character> store = new HashSet<>();
        int size = 1;
        int start =0;
        store.add(a[start]);
        for(int i=1; i<n; i++){
            if(store.contains(a[i])){
                while(store.contains(a[i])){
                    size = i - start > size ? i - start : size;
                    store.remove(a[start++]);
                }
                i--;
            }else{
                store.add(a[i]);
            }
        }
        return store.size() > size ? store.size() : size;
    }
}