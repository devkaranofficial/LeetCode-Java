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
    public boolean isPalindrome(ListNode head) {

        //finding mid of the list
        ListNode slow = head;
        ListNode fast = head;

        while(fast != null && fast.next != null)
        {
            slow = slow.next;
            fast = fast.next.next;
        } 

        //reversing the second half of list now so we can compare
        
        ListNode prev = null;
        ListNode current = slow;

        while(current != null)
        {
            ListNode next = current.next;
            current.next = prev;

            prev = current;
            current = next;
        }

        //Comparison
        ListNode first = head;
        ListNode second = prev;
        while(second != null)
        {
            if(first.val != second.val )
            {
                return false;
            }
            first = first.next;
            second = second.next;
        }
        return true;

    }
}