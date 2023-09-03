/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public TreeNode sortedListToBST(ListNode head) {
        ArrayList<Integer> store = new ArrayList<>();
        ListNode temp = head;
        while(temp != null){
            store.add(temp.val);
            temp = temp.next;
        }

        return construct(store, 0, store.size()-1);
    }

    public TreeNode construct(ArrayList<Integer> store, int start, int end){
        if(start > end) return null;
        int mid  = ( start + end ) / 2; 
        TreeNode root = new TreeNode( store.get(mid) );
        root.left = construct(store, start, mid -1);
        root.right = construct(store, mid+1, end);
        return root;
    }
}