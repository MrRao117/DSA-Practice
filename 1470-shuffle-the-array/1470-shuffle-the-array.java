class Solution {
    public int[] shuffle(int[] nums, int n) {
        int i=0;
        int j=n;
        int k=0;
        int[] ans=new int[nums.length];
        while(k<ans.length){
            if(k%2==0){
                ans[k]=nums[i];
                k++;
                i++;
            }
            else{
                ans[k]=nums[j];
                k++;
                j++;
            }
        }
        return ans;
    }
}