class Solution {
    public boolean uniformArray(int[] nums1) {
        int countEven=0;
        int countOdd = 0;
        int n=nums1.length;
        int min=nums1[0];
        for(int i=0; i<n; i++){
            if(nums1[i]%2==0) countEven++;
            else countOdd++;
             min=Math.min(nums1[i], min);
        }

        if(countEven==n || countOdd==n) return true;
        if(min%2!=0) return true;
        return false;
        
    }
}