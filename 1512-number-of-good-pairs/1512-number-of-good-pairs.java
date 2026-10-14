class Solution {
    public int numIdenticalPairs(int[] nums) {
        int good =0;
        int[] count = new int[101];
        
        for(int i=0; i<nums.length; i++){
            count[nums[i]]++;
        }

        for(int i=0; i<count.length; i++){
            int p = (count[i]*(count[i]-1))/2;
            good+=p;
        }
        return good;
    }
}