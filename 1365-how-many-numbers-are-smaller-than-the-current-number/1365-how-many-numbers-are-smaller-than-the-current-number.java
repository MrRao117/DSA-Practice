class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int[] ans = new int[nums.length];
        
        int[] count = new int[101];

        for(int i=0; i<nums.length; i++){
            count[nums[i]]++;
        }

        for(int i=1; i<101; i++){
            count[i] += count[i-1];
        }

        for(int i=0; i<nums.length; i++){
            if(nums[i]==0){
                ans[i]=0;
            }
            else{
                ans[i]=count[nums[i]-1];
            }
        }

        return ans;
    }
}