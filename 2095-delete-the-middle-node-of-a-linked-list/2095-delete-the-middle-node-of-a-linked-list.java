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
    public ListNode deleteMiddle(ListNode head) {
        if(head==null || head.next==null) return null;
       int size = 1;
       ListNode tail = head;

       while(tail.next!=null){
        tail = tail.next;
        size++;
       }

       int mid = size/2;

        ListNode prev = head;

        for(int i=0; i<mid-1; i++){
            prev = prev.next;
        }

        prev.next = prev.next.next;

        return head;


    }
}