class Solution {
    public int numSub(String s) {
        int count = 0;
       int consecutiveOnes = 0;
       int MOD = 1_000_000_007;
       for (int i = 0; i < s.length(); i++) {
           if(s.charAt(i)=='1'){
                consecutiveOnes++;
                count = (consecutiveOnes+count)%MOD;
           }
           else{
               consecutiveOnes=0;
           }
       }
       return count;
    }
}