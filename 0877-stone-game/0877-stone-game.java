class Solution {
    public boolean stoneGame(int[] piles) {
        int n=piles.length;
        Integer[][] memo = new Integer[n][n];

        return maxScoreDiff(piles,0,n-1,memo)>=0;
    }

    public static int maxScoreDiff(int[] nums, int s, int e, Integer[][] memo){
        if(s==e){
            return nums[s];
        }

        if(memo[s][e]!=null){
            return memo[s][e];
        }

        int pickLeft = nums[s] - maxScoreDiff(nums,s+1,e,memo);
        int pickRight = nums[e] - maxScoreDiff(nums,s,e-1,memo);

        return memo[s][e]=Math.max(pickLeft,pickRight); 
    }
}