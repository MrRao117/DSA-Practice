class Solution {
    public int threeSumClosest(int[] nums, int target) {
        int n=nums.length;
        Arrays.sort(nums);
        int closestSum = nums[0]+nums[1]+nums[2];
        int minDiff = Integer.MAX_VALUE;
        for (int i = 0; i < n-2; i++) {

            if(i>0 && nums[i]==nums[i-1]) continue;;

            int s = i+1;
            int e = n-1;
            while(s<e){
                int sum = nums[i]+nums[s]+nums[e];
                if(sum==target) return target;


                if(Math.abs(sum-target)<Math.abs(closestSum-target)){
                    closestSum=sum;
                }

                else if(sum<target) s++;
                else e--;
            }
        }
        return closestSum;
    }
}