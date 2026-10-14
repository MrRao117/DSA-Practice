class Solution {
    public int[] shuffle(int[] nums, int n) {
        int i=0, j=n, k=0;
        int[] ans = new int[2*n];
        while(k<2*n && i<n && j<2*n){
            ans[k++] = nums[i++];
            ans[k++] = nums[j++];
        }

        return ans;
    }
}