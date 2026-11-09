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
    public ListNode swapPairs(ListNode head) {
        if(head==null || head.next==null) return head;
        ListNode prev = new ListNode(0);
        prev.next = head;
        ListNode temp = prev;
        ListNode curr = prev.next;
        ListNode tail = curr.next;

        while(tail!=null){
            curr.next = tail.next;
            temp.next = tail;
            tail.next = curr;
            if(curr.next==null){
                break;
            }
                curr = curr.next;
                tail = curr.next;
                temp = temp.next.next;
            

        }

        return prev.next;
    }
}