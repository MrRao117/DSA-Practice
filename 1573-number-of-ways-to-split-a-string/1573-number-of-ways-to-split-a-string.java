class Solution {
    public int numWays(String s) {
         long countOnes=0;
        long mod = 1_000_000_007;
        long n=s.length();
        for (int i = 0; i < n; i++) {
            if(s.charAt(i)=='1') countOnes++;
        }

        if(countOnes%3!=0) return 0;

        if(countOnes==0){
            return (int)(((n-1)*(n-2)/2)%mod);
        }

        long onesPerPart=countOnes/3;

        long currentOnes=0;
        long endOf1=-1, startof2=-1;
        long endOf2=-1, startOf3=-1;

        for (int i = 0; i < n; i++) {
            if(s.charAt(i)=='1') {
                currentOnes++;


                if (currentOnes == onesPerPart) endOf1 = i;
                if (currentOnes == onesPerPart + 1) startof2 = i;
                if (currentOnes == 2 * onesPerPart) endOf2 = i;
                if (currentOnes == 2 * onesPerPart + 1) startOf3 = i;
            }
        }

        long waysForFirstCut=startof2-endOf1;
        long waysForSecondCut=startOf3-endOf2;

        return (int)((waysForFirstCut*waysForSecondCut)%mod);
    }
}