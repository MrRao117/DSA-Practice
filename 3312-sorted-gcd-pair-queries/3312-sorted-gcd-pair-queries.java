class Solution {
    public int[] gcdValues(int[] nums, long[] queries) {
        int max = nums[0];
        for (int num : nums) {
            max = Math.max(max, num);
        }

        // 1. count the frequency of each element of nums
        int[] count = new int[max+1];
        for (int i = 0; i < nums.length; i++) {
            count[nums[i]]++;
        }


        long[] countDivisor = new long[max+1];

        for (int i = 1; i <= max; i++) {
            for (int j = i; j <=max ; j+=i) {
                countDivisor[i]+=count[j];
            }
        }

        long[] countGcdPair = new long[max+1];
        for (int i = max; i >=1; i--) {
            long totalPairsWithDivisori = countDivisor[i]*(countDivisor[i]-1)/2;
            countGcdPair[i] = totalPairsWithDivisori;

            for (int j = 2*i; j <=max ; j+=i) {
                countGcdPair[i]-=countGcdPair[j];
            }
        }

        long[] prefixCountGcdPair = new long[max+1];
        for (int i = 1; i < max; i++) {
            prefixCountGcdPair[i]=prefixCountGcdPair[i-1]+countGcdPair[i];
        }


        int[] ans = new int[queries.length];
        for (int i = 0; i < queries.length; i++) {
            ans[i] = getNthGcdPair(queries[i], prefixCountGcdPair);
        }

        return ans;
    }


    public static int getNthGcdPair(long target, long[] prefixCountGcdPair){
        int l=0, r=prefixCountGcdPair.length-1;
        while (l<r){
            int mid = l+(r-l)/2;
            if(target>=prefixCountGcdPair[mid]) l=mid+1;
            else r=mid;
        }
        return l;
    }
}