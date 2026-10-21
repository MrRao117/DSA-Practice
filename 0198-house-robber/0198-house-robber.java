class Solution {
    
    public static int solveUsingRec(int[] nums, int index){
        if(index>= nums.length){
            return 0;
        }

        int include = nums[index] + solveUsingRec(nums, index+2);
        int exclude = solveUsingRec(nums, index+1);
        int ans = Math.max(include, exclude);
        return ans;
    }

    public static int solveUsingMemo(int[] nums, int index, int[] dp){
        if(index>= nums.length){
            return 0;
        }
        if(dp[index]!=-1){
            return dp[index];
        }
        int include = nums[index] + solveUsingMemo(nums, index+2, dp);
        int exclude = solveUsingMemo(nums, index+1, dp);
        int ans = Math.max(include, exclude);
        dp[index] = ans;
        return ans;
    }
    public int rob(int[] nums) {
        int index=0;
        int[] dp = new int[nums.length+1];
        Arrays.fill(dp,-1);
        int ans = solveUsingMemo(nums, index, dp);
        return ans;
    }
}