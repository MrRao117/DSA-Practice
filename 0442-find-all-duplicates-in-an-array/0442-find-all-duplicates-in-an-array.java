class Solution {
    public List<Integer> findDuplicates(int[] nums) {
         int i=0;
        // apply cycle sort
        while(i<nums.length){
            int correct = nums[i]-1;
            if(nums[i]!=nums[correct]){
                int temp=nums[i];
                nums[i]=nums[correct];
                nums[correct]=temp;
            }
            else
                i++;
        }

        // check , if any number is not at its correct index then it is duplicate
        List<Integer> ans = new ArrayList<>();
        for (int j = 0; j < nums.length; j++) {
            if(nums[j]!=j+1){
                ans.add(nums[j]);
            }
        }
        return ans;
    }
}