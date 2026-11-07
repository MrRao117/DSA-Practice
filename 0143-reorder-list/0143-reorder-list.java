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
        ListNode slow = head;
        ListNode fast = head;

        // find mid
        while(fast!=null && fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;
        }

        // reverse second half
        ListNode secondrev = slow.next;
        slow.next = null;

        ListNode prev = null;
        while(secondrev!=null){
            ListNode nextTemp = secondrev.next;
            secondrev.next = prev;
            prev = secondrev;
            secondrev = nextTemp;
        }

        secondrev = prev;

        ListNode first = head;
        while(secondrev!=null){
            ListNode temp1 = first.next;
            ListNode temp2 = secondrev.next;

            first.next = secondrev;
            secondrev.next = temp1;

            first = temp1;
            secondrev = temp2;
        }
    }
}