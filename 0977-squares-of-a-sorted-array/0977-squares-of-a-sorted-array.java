class Solution {
    public int[] sortedSquares(int[] nums) {
        int s=0, e=nums.length-1;
        int[] ans = new int[nums.length];
        int k=ans.length-1;
        while(s<=e){
            if(nums[s]*nums[s]<nums[e]*nums[e]){
                ans[k--]=nums[e]*nums[e];
                e--;
            }
            else{
                ans[k--]=nums[s]*nums[s];
                s++;
            }
        }
        return ans;
    }
}