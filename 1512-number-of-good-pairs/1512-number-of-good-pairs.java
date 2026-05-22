class Solution {
    public int numIdenticalPairs(int[] nums) {
        int[] count=new int[101];
        for(int i=0;i<nums.length;i++){
            count[nums[i]]++;
        }
        int goodPairs=0;
        for (int i = 0; i < count.length; i++) {
            int x=count[i];
            if(x>1){
                goodPairs+=x*(x-1)/2;
            }
        }
        return goodPairs;
    }
}