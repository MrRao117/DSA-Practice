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
    public ListNode sortList(ListNode head) {
        if(head==null || head.next==null){
            return head;
        }   

        ListNode mid = getMid(head);
        ListNode left = sortList(head);
        ListNode right = sortList(mid);

        return merge(left, right);
    }

    private ListNode getMid(ListNode head){
        ListNode s = head;
        ListNode f = head;
        ListNode prev = null;

        while(f!=null && f.next!=null){
            prev = s;
            s=s.next;
            f=f.next.next;
        }

        if(prev != null) {
            prev.next = null;
        }

        return s;
    }

    private ListNode merge(ListNode left, ListNode right){
        ListNode dummyHead = new ListNode();
        ListNode tail = dummyHead;

        while(left!=null && right!=null){
            if(left.val<right.val){
                tail.next = left;
                left=left.next;
                tail = tail.next;
            }

            else{
                tail.next = right;
                right=right.next;
                tail = tail.next;
            }
        }

        while(left!=null){
            tail.next = left;
            left=left.next;
            tail = tail.next;
        }

        while(right!=null){
            tail.next = right;
            right=right.next;
            tail = tail.next;
        }

        return dummyHead.next;
    }
}