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
    public ListNode partition(ListNode head, int x) {
        ListNode dummy_less = new ListNode(0);
        ListNode dummy_less_head = dummy_less;
        ListNode dummy_more = new ListNode(0);
        ListNode dummy_more_head = dummy_more;
        ListNode current = head;
        while(current != null)
        {
            if(current.val < x)
            {
                dummy_less.next = current;
                dummy_less = dummy_less.next; 
            }
            else
            {
                dummy_more.next = current;
                dummy_more = dummy_more.next; 
            }
            current = current.next;
        }
        dummy_less.next = dummy_more_head.next;
        dummy_more.next = null;
        return dummy_less_head.next;
        
    }
}