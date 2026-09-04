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

        ListNode headCopy = head;
        ListNode output = null;

        while(headCopy != null){
            ListNode current = headCopy.next;
            headCopy.next = output;
            output = headCopy;
            headCopy = current;
        }
        return output;
    }
}
