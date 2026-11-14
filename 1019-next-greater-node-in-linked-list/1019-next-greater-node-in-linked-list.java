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
    public int[] nextLargerNodes(ListNode head) {
        List<Integer> list = new ArrayList<>();
        ListNode tail = head;
        while(tail!=null){
            list.add(tail.val);
            tail = tail.next;
        }
        int n = list.size();
        int[] ans = new int[n];
        for(int i=0; i<n ; i++){
            int max = list.get(i);
            for(int j=i+1; j<n; j++) {
                if(max<list.get(j)) {
                    max=list.get(j);
                    break;
                }
            }
            if(max==list.get(i)){
                ans[i] = 0;
            }
            else{
                ans[i] = max;
            }
        }
        return ans;

    }
}