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
        /*
        1. figure out the half way point of the list
        2. reverse the second half of the list
        3. merge the 2
        */
        ListNode fast = head.next;
        ListNode slow = head;
        while(fast != null && fast.next != null){
            fast = fast.next.next;
            slow = slow.next;
        }

        ListNode reverse = slow.next;
        ListNode prev = slow.next = null;
        while(reverse != null){
            ListNode temp = reverse.next;
            reverse.next = prev;
            prev = reverse;
            reverse = temp;
        }

        ListNode headCopy = head;
        reverse = prev;
        while(reverse != null){
            ListNode temp1 = headCopy.next;
            ListNode temp2 = reverse.next;
            headCopy.next = reverse;
            reverse.next = temp1;
            headCopy = temp1;
            reverse = temp2;
        }

    }
}