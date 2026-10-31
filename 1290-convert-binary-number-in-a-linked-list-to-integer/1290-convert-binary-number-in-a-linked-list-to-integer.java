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
    public int getDecimalValue(ListNode head) {
        // ListNode temp = head;
        // List<Integer> list = new ArrayList<>();

        // while(temp!=null){
        //     list.add(temp.val);
        //     temp = temp.next;
        // }
        // int ans = 0;
        // int k=0;
        // for(int i=list.size()-1; i>=0; i--){
        //     int n = list.get(i);
        //     ans = ans + (int)(n*Math.pow(2, k));
        //     k++;
        // }

        // return ans;

        int res = 0;
        while(head!=null){
            res = res*2 + head.val;
            head = head.next;
        }
        return res;
    }
}