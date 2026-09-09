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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        int length = 0;
        ListNode headCopy = head;
        while(headCopy != null){
            length++;
            headCopy = headCopy.next;
        }
        int index = length-n;
        
        if(index == 0) 
            return head.next;
        
        headCopy = head;
        for(int i = 0; i < index-1; i++)
            headCopy = headCopy.next;
        headCopy.next = headCopy.next.next;

        return head;
    }
}
