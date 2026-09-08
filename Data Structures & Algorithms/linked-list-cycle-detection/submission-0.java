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
    public boolean hasCycle(ListNode head) {
        HashSet<ListNode> set = new HashSet<>();
        ListNode dummy = head;
        while(dummy != null){
            if(set.contains(dummy)){
                return true;
            }
            set.add(dummy);
            dummy = dummy.next;
        }
        return false;
    }
}
