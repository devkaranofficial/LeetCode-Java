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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode rev_1 = reverse(l1);
        ListNode rev_2 = reverse(l2);
        int carry = 0;
        ListNode dummy = new ListNode(0);
        ListNode result = dummy;
        while(rev_1 != null || rev_2 != null || carry != 0)
        {
            int val1 = (rev_1 != null)? rev_1.val : 0 ;
            int val2 = (rev_2 != null)? rev_2.val : 0 ;

            int sum = val1 + val2 + carry;
            int digit = sum % 10;
            carry = sum / 10;
            result.next = new ListNode(digit);
            result = result.next;
            if(rev_1 != null)
            {
                rev_1 = rev_1.next;
            }
            if(rev_2 != null)
            {
                rev_2 = rev_2.next;
            }
        }
        ListNode final_result = reverse(dummy.next);
        return final_result;
        
    }
    private ListNode reverse(ListNode head)
    {
        ListNode prev = null;
        ListNode current = head;
        while(current != null)
        {
            ListNode next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        return prev;
    }
}