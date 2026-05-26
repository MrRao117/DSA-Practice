class Solution {
    public boolean isGoodArray(int[] nums) {
        int runningGcd=nums[0];
        if(nums.length==1){
            if(runningGcd==1)
                return true;
            else 
                return false;
        }
        for (int i = 1; i < nums.length; i++) {
            runningGcd=gcd(runningGcd,nums[i]);
            if(runningGcd==1){
                return true;
            }
        }
        return false;
    }

    public static int gcd(int a, int b){
        while(b!=0){
            int rem=a%b;
            a=b;
            b=rem;
        }
        return a;
    }
}