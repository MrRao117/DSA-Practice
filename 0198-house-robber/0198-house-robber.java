class Solution {
    public int rob(int[] nums) {
        if(nums.length==0)
            return 0;
        if(nums.length==1)
            return nums[0];

        int robOld=nums[0];
        int robNew=Math.max(nums[0], nums[1]);
        for (int i = 2; i < nums.length; i++) {
            int currentMax=Math.max(robNew, nums[i]+robOld);

            robOld=robNew;
            robNew=currentMax;
        }
        return robNew;
    }
}