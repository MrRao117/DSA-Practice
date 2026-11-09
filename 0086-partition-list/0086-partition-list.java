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
    public ListNode partition(ListNode head, int x) {
        ListNode small = new ListNode(0);
        ListNode large = new ListNode(x);

        ListNode s = small;
        ListNode l = large;
        ListNode temp = head;

        while(temp!=null){
            if(temp.val<x){
                s.next = new ListNode(temp.val);
                s = s.next;
            }else{
                l.next = new ListNode(temp.val);
                l = l.next;
            }
            
            
            temp = temp.next;
        }

        s.next = large.next;

        return small.next;
    }
}