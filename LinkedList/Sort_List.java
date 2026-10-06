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
    public ListNode sortList(ListNode head) {
        
        if(head == null || head.next == null)
        {
            return head;
        }
        ListNode current = head;
        ListNode slow = head;
        ListNode fast = head.next;
        while(fast != null && fast.next != null)
        {
            slow = slow.next;
            fast = fast.next.next;
        }
        
        ListNode left_head = head;
        ListNode right_head = slow.next;
        slow.next = null;
        ListNode l1 = sortList(left_head);
        ListNode l2 = sortList(right_head);
        ListNode sorted_list = merge_sort(l1 , l2);
        return sorted_list;

        
        
    }
    private ListNode merge_sort(ListNode head1 , ListNode head2)
    {
        ListNode ptr1 = head1;
        ListNode ptr2 = head2;
        
        ListNode dummy = new ListNode(0);
        ListNode head_dummy = dummy;
        while(ptr1 != null && ptr2 != null)
        {
            if(ptr1.val < ptr2.val )
            {
                dummy.next = ptr1;
                ptr1 = ptr1.next;
            }
            else
            {
                dummy.next = ptr2;
                ptr2 = ptr2.next;
            }
            dummy = dummy.next;
        }
        if(ptr1 != null)
        {
            dummy.next = ptr1;
        }
        else
        {
            dummy.next = ptr2;
        }
        return head_dummy.next;
    }
}