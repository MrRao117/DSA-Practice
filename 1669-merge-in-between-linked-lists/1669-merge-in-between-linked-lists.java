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
    public ListNode mergeInBetween(ListNode list1, int a, int b, ListNode list2) {
        
        ListNode prevA = list1;

        for(int i=0; i<a-1; i++){
            prevA = prevA.next;
        }

        ListNode nextB = prevA.next;

        for(int i=0; i<(b-a+1); i++){
            nextB = nextB.next;
        }

        ListNode tail2 = list2;
        while(tail2.next!=null){
            tail2 = tail2.next;
        }

        prevA.next = list2;
        tail2.next = nextB;

        return list1;
        
    }


}