class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        int min=nums[0];
        int max=nums[0];
        for(int i=0; i<nums.length; i++){
            min=Math.min(min,nums[i]);
            max=Math.max(max,nums[i]);
        }
        List<Integer> ans = new ArrayList();
        int[] arr = new int[max+1];
        for(int i=0; i<nums.length; i++){
            arr[nums[i]]++;
        }

        for(int i =min; i<max; i++){
            if(arr[i]==0) ans.add(i);
        }
        return ans;
    }
}