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
make a heap of 1-k numbers
go through all the lists once and insert their head into the heap 
    insertion should be an array that stores the value and which list it came from

while the heap is not empty
    extract the min and attach it to the output
    from the min's list, add the head to the heap unless head is null
 */

class Solution {
    public ListNode mergeKLists(ListNode[] lists) {
        PriorityQueue<int[]> minHeap = 
            new PriorityQueue<>((a, b) -> Integer.compare(a[0], b[0]));
        
        ListNode output = new ListNode();
        ListNode outputNext = output;

        for(int i = 0; i < lists.length; i++){
            if(lists[i] != null)
                minHeap.add(new int[]{lists[i].val, i});
        }

        while(!minHeap.isEmpty()){
            int[] smallest = minHeap.poll();

            outputNext.next = new ListNode(smallest[0]);
            outputNext = outputNext.next;

            if(lists[smallest[1]].next != null){
                lists[smallest[1]] = lists[smallest[1]].next;
                minHeap.add(new int[]{lists[smallest[1]].val, smallest[1]});
            }
        }

        return output.next;

    }
}
