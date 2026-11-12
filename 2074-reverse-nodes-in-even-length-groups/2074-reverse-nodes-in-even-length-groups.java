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
    public ListNode reverseEvenLengthGroups(ListNode head) {
        int prevcount = 0;
        ListNode dummy = new ListNode(0, head);
        ListNode prevTail = dummy;
        ListNode curr = head;

       while (curr != null) {
            int currcount = 0;
            ListNode start = curr;
            ListNode end = start;
            while (currcount <= prevcount && end != null) {
                end = end.next;
                currcount++;
            }

            if (currcount % 2 == 0) {
                ListNode newHead = reverse(start, end);
                prevTail.next = newHead;
                prevTail = start;
                curr = end;
            }else {
                prevTail.next = start;
                for (int i = 0; i < currcount; i++) {
                    prevTail = curr;
                    curr = curr.next;
                }
            }
            prevcount++;
        }

            
        

        return dummy.next;
    }


    public ListNode reverse(ListNode start, ListNode end) {
        ListNode prev = end;
        ListNode curr = start;
        
        while (curr != end) {
            ListNode nextTemp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = nextTemp;
        }
        return prev;
    }
}