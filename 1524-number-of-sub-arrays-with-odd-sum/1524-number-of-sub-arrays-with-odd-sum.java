class Solution {
    public int numOfSubarrays(int[] arr) {
        int n = arr.length;
        int MOD = 1_000_000_007;
        int oddCount = 0;
        int evenCount = 1;
        int ans = 0;
        int prefixSum = 0;
        for(int i=0; i<n; i++){
            prefixSum+=arr[i];
            if(prefixSum%2!=0){
                ans = (ans+evenCount)%MOD;
                oddCount++;
            }else{
                ans = (ans+oddCount)%MOD;
                evenCount++;
            }
        }
        return ans;
    }
}