class Solution {
    public int findNumbers(int[] nums) {
        int even=0;
        for(int i=0; i<nums.length; i++){
            int n = countDigits(nums[i]);
            if(n%2==0) even++;
        }
        return even;
    }

    private int countDigits(int n){
        int count=0;
        while(n>0){
            n=n/10;
            count++;
        }
        return count;
    }
}