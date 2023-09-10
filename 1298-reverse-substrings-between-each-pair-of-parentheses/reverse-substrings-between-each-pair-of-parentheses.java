class Solution {
    public String reverseParentheses(String s) {
        Stack<Character> store = new Stack<>();
        Queue<Character> temp = new ArrayDeque<>();
        StringBuilder sb = new StringBuilder();
        int n = s.length();
        for(int i=0; i<n; i++){
            if(!store.isEmpty() && s.charAt(i) == ')'){
                while(store.peek() != '(') temp.add(store.pop());
                store.pop();
                while(!temp.isEmpty()) store.push(temp.poll());
            }else store.push(s.charAt(i));
        }
        for(char c : store){
            sb.append(c);
        }
        return new String(sb);
    }
}