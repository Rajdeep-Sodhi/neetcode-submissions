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
 /*
split the list into k lists
if list is k length, reverse it
use a seperate list function
 */

class Solution {
    public ListNode reverseKGroup(ListNode head, int k) {
        ListNode output = new ListNode();
        ListNode outputNext = output;
        ListNode curr = head;

        while(curr != null){
            int i = 1;
            ListNode kNodes = curr;
            while(kNodes.next != null && i < k){
                kNodes = kNodes.next;
                i++;
            }

            if(i == k){
                ListNode cont = null;
                if(kNodes != null){
                    cont = kNodes.next;
                    kNodes.next = null;
                }
                ListNode reversed = reverseList(curr);
                outputNext.next = reversed;
                while(outputNext.next != null)
                    outputNext = outputNext.next;
                curr = cont;
            }
            else{
                outputNext.next = curr;
                break;
            }
            
        }

        return output.next;
    }
    public ListNode reverseList(ListNode head) {
        ListNode prev = null;
        ListNode curr = head;

        while (curr != null) {
            ListNode temp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = temp;
        }
        return prev;
    }
}
