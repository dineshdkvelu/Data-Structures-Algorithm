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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode temp = head;
        if(temp.next == null && n == 1) return null;
        int node = 0;
        while(temp.next != null){
            temp = temp.next;
            node++;
        }
        temp = head;
        System.out.println(node);
        int i=0;
        while(temp != null){
            if(i == node -n){
                if(temp.next != null ) temp.next = temp.next.next;
                break;
            }else if (node - n < 0) return head = head.next;
            temp = temp.next;
            i++;
        }
        return head;
    }
}