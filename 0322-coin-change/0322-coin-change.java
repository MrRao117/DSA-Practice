class Solution {

     public static int solveUsingRecursion(int[] coins, int amount){
        // base case
        if(amount==0){
            return 0;
        }

        // to create this amount we will try each and every coin
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < coins.length; i++) {
            if(coins[i]<=amount){
                //its a valid case
                // we have used one coin
                int recursionAns = solveUsingRecursion(coins, amount-coins[i]);

                // recursionAns may or may not be valid
                if(recursionAns!=Integer.MAX_VALUE){
                    // We got a valid answer
                    //it may or may not be a minimum answer
                    min = Math.min(min, 1+recursionAns);
                }
            }
        }

        return min;
    }

    public static int solveUsingMemorisation(int[] coins, int amount, int[] dp){
        // base case
        if(amount==0){
            return 0;
        }
        if(dp[amount]!=-1){
            return dp[amount];
        }
        // to create this amount we will try each and every coin
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < coins.length; i++) {
            if(coins[i]<=amount){
                //its a valid case
                // we have used one coin
                int recursionAns = solveUsingMemorisation(coins, amount-coins[i], dp);

                // recursionAns may or may not be valid
                if(recursionAns!=Integer.MAX_VALUE){
                    // We got a valid answer
                    //it may or may not be a minimum answer
                    min = Math.min(min, 1+recursionAns);
                }
            }
        }
        dp[amount] = min;
        return min;
    }

    public int coinChange(int[] coins, int amount) {
        int n = amount;
        int[] dp = new int[n+1];
        Arrays.fill(dp, -1);
        int ans = solveUsingMemorisation(coins, amount, dp);
        if(ans==Integer.MAX_VALUE){
            return -1;
        }
        else{
            return ans;
        }
    }
}