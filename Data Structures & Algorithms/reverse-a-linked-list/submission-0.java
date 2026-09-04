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
    public ListNode reverseList(ListNode head) {
        if(head == null)
            return head;
        ListNode headCopy = head;
        ListNode output = new ListNode(headCopy.val);
        headCopy = headCopy.next;
        while(headCopy != null){
            ListNode current = new ListNode(headCopy.val);
            current.next = output;
            output = current;
            headCopy = headCopy.next;
        }
        return output;
    }
}
