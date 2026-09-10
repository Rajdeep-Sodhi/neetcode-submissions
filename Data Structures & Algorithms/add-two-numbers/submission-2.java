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
        /*
        iterate through both lists once and add their numbers to a string
        convert string to a int
        use mod and division to take each digit
        */
        ListNode l1Dummy = l1;
        String first = "";
        while(l1Dummy != null){
            first = l1Dummy.val + first;
            l1Dummy = l1Dummy.next;
        }

        ListNode l2Dummy = l2;
        String second = "";
        while(l2Dummy != null){
            second = l2Dummy.val + second;
            l2Dummy = l2Dummy.next;
        }

        ListNode output = new ListNode();
        ListNode outputDummy = output;
        boolean carry = false;

        while(first != "" && second != ""){
            int sum = Integer.parseInt(first.substring(first.length()-1, first.length())) + Integer.parseInt(second.substring(second.length()-1, second.length()));
            if(carry){
                sum++;
                carry = false;
            }
            if(sum > 9){
                carry = true;
            }
            outputDummy.next = new ListNode(sum % 10);
            outputDummy = outputDummy.next;
            first = first.substring(0, first.length()-1);
            second = second.substring(0, second.length()-1);
        }
        while(first != ""){
            int sum = Integer.parseInt(first.substring(first.length()-1, first.length()));
            if(carry){
                sum++;
                carry = false;
            }
            if(sum > 9){
                carry = true;
            }
            outputDummy.next = new ListNode(sum % 10);
            outputDummy = outputDummy.next;
            first = first.substring(0, first.length()-1);
        }
        while(second != ""){
            int sum = Integer.parseInt(second.substring(second.length()-1, second.length()));
            if(carry){
                sum++;
                carry = false;
            }
            if(sum > 9){
                carry = true;
            }
            outputDummy.next = new ListNode(sum % 10);
            outputDummy = outputDummy.next;
            second = second.substring(0, second.length()-1);
        }
        if(carry){
            outputDummy.next = new ListNode(1);
        }

        return output.next;
    }
}
