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
    public ListNode deleteDuplicates(ListNode head) {
        if(head==null || head.next==null) return head;
        ListNode prev = new ListNode(0);
        prev.next = head;
        ListNode curr = prev;
        ListNode tail = curr.next;

        while(tail!=null && tail.next != null){
            if(tail.val == tail.next.val){
                while(tail.next!=null && tail.val==tail.next.val){
                    tail = tail.next;
                }
                tail = tail.next;
                curr.next = tail;

            }
            
            else{
                curr = curr.next;
                tail = tail.next;
            }
        }
        return prev.next;
    }
}