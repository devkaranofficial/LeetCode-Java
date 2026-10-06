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
    public void reorderList(ListNode head) {
        ListNode current1 = head;
        ListNode slow = head;
        ListNode fast = head;

        //Find Middle
        while(fast != null && fast.next!= null)
        {
            slow = slow.next;
            fast = fast.next.next;
        }

        //Reverse 2nd half and split
        
        ListNode prev = null;
        ListNode current = slow.next;
        slow.next = null;
        while(current != null)
        {
            ListNode next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        ListNode current2 = prev;

        while(current2 != null && current1 != null)
        {
            ListNode next1 = current1.next;
            ListNode next2 = current2.next;
            current1.next = current2;
            current1 = next1;

            current2.next = current1;
            current2 = next2;
        }
        
    }
}