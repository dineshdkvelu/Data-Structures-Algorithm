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
class Solution {
    public ListNode reverseBetween(ListNode head, int l, int r) {
        if(head.next == null || l == r) return head;
        ListNode slow = head;
        ListNode fast = head;
        ListNode left = null;
        ListNode right = null;
        int k = r - l;
        while( k-- > 0 ) fast = fast.next;
        while( l-- > 1){
            left = slow;
            slow = slow.next;
            fast = fast.next;
        }
        if(fast.next != null)right = fast.next;
        if( left == null) head = fast;
        fast.next = null;
        reverse(slow);
        if(left != null )left.next = fast;
        slow.next = right;       
        return head;
    }

    public void reverse(ListNode head){
        ListNode temp = head;
        ListNode prev = null;
        ListNode after = head;
        while(temp != null){
            after = temp.next;
            temp.next = prev;
            prev = temp;
            temp = after;
        }
    }
}