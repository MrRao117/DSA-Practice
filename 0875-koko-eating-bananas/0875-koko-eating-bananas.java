class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int maxSpeed = 1;
        for (int i = 0; i < piles.length; i++) {
            if(maxSpeed<piles[i]){
                maxSpeed = piles[i];
            }
        }

        int start=1;
        int end=maxSpeed;
        int ans=1;
        while(start<=end){
            int mid=start+(end-start)/2;
            long totalHour = totalhours(mid, piles);

            if(totalHour>h){
                start = mid+1;
            }

            else{
                ans = mid;
                end=mid-1;
            }
        }
        return ans;
    }

    public long totalhours(int k, int[] piles){
        long th=0;
        for (int i = 0; i < piles.length; i++) {
            th+=(piles[i]+k-1)/k;
        }
        return th;
    }
}