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
    public ListNode reverseBetween(ListNode head, int left, int right) {
      ListNode dummy = new ListNode(0);
      dummy.next = head;
      ListNode left_connect;
      ListNode right_connect;
      ListNode left_rev;
      ListNode right_rev;

      ListNode current = dummy;

      for(int i = 1 ;i < left ; i++)
      { 
        current = current.next;
      }
      left_connect = current;
      left_rev = current.next;

      for(int i = left ; i <= right ; i++)
      {
        current = current.next;
      }
      right_rev = current;
      right_connect = current.next;

    //reversing
    ListNode prev = right_connect;
    ListNode current_1 = left_rev;
    while(current_1 != right_connect)
    {
        ListNode next = current_1.next;
        current_1.next = prev;
        prev = current_1;
        current_1 = next;
    }

    left_connect.next = prev;
    return dummy.next;


    }
}