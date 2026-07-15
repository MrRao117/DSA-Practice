class Solution {
    public int gcdOfOddEvenSums(int n) {
     int sumOdd=0;
        int sumEven=0;
        int o=1, e=2;
        for (int i = 1; i <= n; i++) {
            sumOdd+=o;
            o+=2;
        }

        for (int i = 1; i <= n; i++) {
            sumEven+=e;
            e+=2;
        }

        return gcd(sumOdd,sumEven);
    }

    public static int gcd(int sumOdd, int sumEven){
        int ans=Math.min(sumEven,sumOdd);

        while(ans>0){
            if(sumEven%ans==0 && sumOdd%ans==0){
                return ans;
            }
            else{
                ans--;
            }
        }
        return ans;
    }
}