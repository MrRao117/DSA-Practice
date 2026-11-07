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
    public ListNode swapNodes(ListNode head, int k) {
        if(head==null || head.next==null) return head;
        ListNode tail = head;
        int i=1;
        while(tail.next!=null){
            tail = tail.next;
            i++;
        }

        ListNode r1 = head;
        for (int j = 1; j < k; j++) {
            r1 = r1.next;
        }

        ListNode r2 = head;
        for (int j = 1; j < i - k + 1; j++) {
            r2 = r2.next;
        }

        int temp = r1.val;
        r1.val = r2.val;
        r2.val = temp;

        return head;


    }
}