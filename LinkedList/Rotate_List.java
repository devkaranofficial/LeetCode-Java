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
    public ListNode rotateRight(ListNode head, int k) {
        if(head == null || head.next == null)
        {
            return head;
        }
        int length = 1;
        ListNode current = head;
        while(current.next != null)
        {
            current = current.next;
            length++;
        }

        int rounds = k % length;

        //Cyclic
        current.next = head;
        ListNode end = head;
        for(int i = 1 ; i < length - rounds ;  i++)
        {
            end = end.next;
        }
        ListNode new_head = end.next;
        end.next = null;
        return new_head;

        
    }
}