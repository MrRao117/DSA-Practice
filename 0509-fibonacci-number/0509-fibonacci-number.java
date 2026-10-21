class Solution {
    public int fibUsingRec(int n){
        if(n==0) return 0;
        if(n==1) return 1;

        int ans = fibUsingRec(n-1) + fibUsingRec(n-2);
        return ans;
    }
    
    // using memo
     public int fibUsingMemo(int n, int[] dp){
        if(n==0) return 0;
        if(n==1) return 1;
        if(dp[n]!=-1){
            return dp[n];
        }
        int ans = fibUsingMemo(n-1, dp) + fibUsingMemo(n-2, dp);
        dp[n] = ans;
        return ans;
    }

    public int fib(int n) {
        int[] dp = new int[n+1];
        Arrays.fill(dp, -1);
        int ans= fibUsingMemo(n, dp);
        return ans;
    }
}