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
    public boolean isPalindrome(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        while(fast!=null && fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;
        }

        ListNode secondHalfHead = reverseList(slow);
        ListNode firstHalfHead = head;

        ListNode p2 = secondHalfHead;
        ListNode p1 = firstHalfHead;
        while(p2!=null){
            if(p1.val!=p2.val){
                return false;
            }
            p1 = p1.next;
            p2 = p2.next;
        }

        reverseList(secondHalfHead);
        return true;
        
        // List<Integer> list = new ArrayList<>();
        // ListNode temp = head;
        // while(temp!=null){
        //     list.add(temp.val);
        //     temp = temp.next;
        // }
        // int start = 0, end = list.size()-1;
        // while(start<end){
        //     if(list.get(start)!=list.get(end)) return false;
        //     start++;
        //     end--;
        // }
        // return true;
    }


    public ListNode reverseList(ListNode head){
        ListNode prev = null;
        ListNode curr = head;
        while(curr!=null){
            ListNode nextTemp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = nextTemp;
        }
        return prev;
    }
}